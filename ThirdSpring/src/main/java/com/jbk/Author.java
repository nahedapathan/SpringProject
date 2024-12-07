package com.jbk;

public class Author {

	String AuthName;

	public String getAuthName() {
		return AuthName;
	}

	public void setAuthName(String authName) {
		AuthName = authName;
	}

	@Override
	public String toString() {
		return "Author [AuthName=" + AuthName + "]";
	}
	
	
}
