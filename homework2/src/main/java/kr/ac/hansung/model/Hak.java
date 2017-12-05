package kr.ac.hansung.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Hak {
	private int year;
	private int semester;
	private String code;
	private String name;
	private String check;
	private int score;
	
	
}
