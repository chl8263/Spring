package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Hak;
import kr.ac.hansung.model.One;
import kr.ac.hansung.model.Sum;
import kr.ac.hansung.model.Two;
@Repository
public class HakDAO {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowcount() {
		String sqlStatement = "select count (*) from offers";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}

	public Hak getHak(String name) {
		String sqlstatement = "select * from hak where name=?";
		return jdbcTemplate.queryForObject(sqlstatement, new Object[] { name }, new RowMapper<Hak>() {

			@Override // 레코드
			public Hak mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				Hak hak = new Hak();
				hak.setYear(rs.getInt("year"));
				hak.setSemester(rs.getInt("semester"));
				hak.setCode(rs.getString("code"));
				hak.setName(rs.getString("name"));
				hak.setCheck(rs.getString("check"));
				hak.setScore(rs.getInt("score"));
				return hak;

			}
		});
	}
	public List<One> getOne() {
		String sqlstatement = "select year,semester ,sum(score) from hak group by year,semester";
		return jdbcTemplate.query(sqlstatement, new RowMapper<One>() {

			@Override // 레코드
			public One mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				One one = new One();
				one.setYear(rs.getInt("year"));
				one.setSemester(rs.getInt("semester"));
				one.setScore(rs.getInt("sum(score)"));
				return one;
			}
		});
	}
	public One getOne(String name) {
		String sqlstatement = "select year,semester ,sum(score) from hak group by semester;";
		return jdbcTemplate.queryForObject(sqlstatement, new Object[] { name }, new RowMapper<One>() {

			@Override // 레코드
			public One mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				One one = new One();
				one.setYear(rs.getInt("year"));
				one.setSemester(rs.getInt("semester"));
				one.setScore(rs.getInt("score"));
				return one;
			}
		});
	}
	//query and return multiple objects
	public List<Hak> getOne_link(int year , int semester) {
		String sqlstatement = "select * from hak where year='"+year+"' and semester='"+semester+"'";
		return jdbcTemplate.query(sqlstatement, new RowMapper<Hak>() {

			@Override // 레코드
			public Hak mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				Hak hak = new Hak();
				hak.setYear(rs.getInt("year"));
				hak.setSemester(rs.getInt("semester"));
				hak.setCode(rs.getString("code"));
				hak.setName(rs.getString("name"));
				hak.setCheck(rs.getString("check"));
				hak.setScore(rs.getInt("score"));
				return hak;

			}
		});
	}
	
	public List<Two> getTwo() {
		String sqlstatement = "select `check` , sum(score) from hak group by `check`";
		return jdbcTemplate.query(sqlstatement, new RowMapper<Two>() {
			@Override // 레코드
			public Two mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				Two two = new Two();
				two.setName(rs.getString("check"));
				two.setValue(rs.getInt("sum(score)"));
				return two;
			}
		});
	}
	public List<Hak> getThree() {
		String sqlstatement = "select * from hak ";
		return jdbcTemplate.query(sqlstatement, new RowMapper<Hak>() {

			@Override // 레코드
			public Hak mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				Hak hak = new Hak();
				hak.setYear(rs.getInt("year"));
				hak.setSemester(rs.getInt("semester"));
				hak.setCode(rs.getString("code"));
				hak.setName(rs.getString("name"));
				hak.setCheck(rs.getString("check"));
				hak.setScore(rs.getInt("score"));
				return hak;

			}
		});
	}
	public Sum getsum() {
		String sqlstatement = "select sum(score) from hak";
		return jdbcTemplate.queryForObject(sqlstatement, new Object[] {  }, new RowMapper<Sum>() {

			@Override // 레코드
			public Sum mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				Sum sum = new Sum();
				sum.setSum(rs.getInt("sum(score)"));
				return sum;
			}
		});
	}
	public List<Hak> getFour() {
		String sqlstatement = "select * from hak where year='2018'";
		return jdbcTemplate.query(sqlstatement, new RowMapper<Hak>() {

			@Override // 레코드
			public Hak mapRow(ResultSet rs, int rowNum) throws SQLException { // 레코드들을 객체로 바꿔주는 곳 우리가 직접 정의
				Hak hak = new Hak();
				hak.setYear(rs.getInt("year"));
				hak.setSemester(rs.getInt("semester"));
				hak.setCode(rs.getString("code"));
				hak.setName(rs.getString("name"));
				hak.setCheck(rs.getString("check"));
				hak.setScore(rs.getInt("score"));
				return hak;
			}
		});
	}
	public boolean insert(Hak hak) {
		int year = hak.getYear();
		int semester = hak.getSemester();
		String code = hak.getCode();
		String name = hak.getName();
		String check = hak.getCheck();
		int score = hak.getScore();
		
		String sqlStatement = "insert into hak (year,semester,code,name,`check`,score) values(?,?,?,?,?,?)";
		return (jdbcTemplate.update(sqlStatement,new Object[] {year,semester,code,name,check,score}) ==1);
	}
	public boolean update(Hak hak) {
		int year = hak.getYear();
		int semester = hak.getSemester();
		String code = hak.getCode();
		String name = hak.getName();
		String check = hak.getCheck();
		int score = hak.getScore();
		
		String sqlStatement = "update hak set year=? , semester=?,code=? where id=?";
		return (jdbcTemplate.update(sqlStatement,new Object[] {year,semester,code,name,check,score}) ==1);
	}
	public boolean delete(int id) {
		String sqlStatement = "delete from offers where id=?";
		return (jdbcTemplate.update(sqlStatement,new Object[] {id}) ==1);
	}

	

	
}










