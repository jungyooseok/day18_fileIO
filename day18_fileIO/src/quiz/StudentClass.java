package quiz;

import java.io.Serializable;

public class StudentClass implements Serializable{
	private String stNum;
	private String name;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
