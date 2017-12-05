package kr.ac.hansung.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.HakDAO;
import kr.ac.hansung.model.Hak;
import kr.ac.hansung.model.One;
import kr.ac.hansung.model.Sum;
import kr.ac.hansung.model.Two;
@Service
public class Hakservice {
	@Autowired
	private HakDAO hakDAO;
	
	public List<One> getOne() {
		return hakDAO.getOne();
	}
	public List<Hak> getOne_link(int year,int semester) {
		return hakDAO.getOne_link(year,semester);
	}
	public List<Two> getTwo() {
		return hakDAO.getTwo();
	}
	public Sum sum() {
		return hakDAO.getsum();
	}
	public List<Hak> getThree() {
		return hakDAO.getThree();
	}
	public void insert(@Valid Hak hak) {
		hakDAO.insert(hak);		
	}
	public List<Hak> getFour() {
		return hakDAO.getFour();
	}
}
