package in.sp.beans;

import java.util.List;

public class Subjects {
   
	private List<String> subjects;

	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subjects(List<String> subjects) {
		super();
		this.subjects = subjects;
	}
	

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Subjects [subjects=" + subjects + "]";
	}
	
	
}
