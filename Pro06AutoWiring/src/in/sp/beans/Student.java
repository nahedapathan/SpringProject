package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int rollno;
	private String name;
	
	@Autowired
	@Qualifier("createAddrObj1")
	private Address address;
	
	private Subjects subjects;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollno, String name, Address address, Subjects subjects) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.subjects = subjects;
	}


	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	public Subjects getSubjects() {
		return subjects;
	}


	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", subjects=" + subjects + "]";
	}
	
	
	
}
