package com.devopsfun.searching;

import java.util.Set;

public class Student {
	private String name ;
	private  double grade ;
	private Set<String> cources;
	public Student(String name, double grade, String ...cources) {
		super();
		this.name = name;
		this.grade = grade;
 	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, grade=%s, cources=%s]", name, grade, cources);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Set<String> getCources() {
		return cources;
	}
	public void setCources(Set<String> cources) {
		this.cources = cources;
	}
	
	

}
