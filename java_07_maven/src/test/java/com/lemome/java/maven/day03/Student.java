package com.lemome.java.maven.day03;

public class Student {
	private String name;
	private String age;
	private String gendr;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGendr() {
		return gendr;
	}
	public void setGendr(String gendr) {
		this.gendr = gendr;
	}
	
	
	
	 public Student() {//默认构造函数
		 System.out.println("student.studen()");
		
	}
	 //带参构造函数
	 public Student (String  name,String age,String gender) {
		this.name=name;
	this.age=age;
	this.gendr=gender;
	
	}
	@Override
	public String toString() {
	return  "name="+this.name+",age="+this.age+",gender="+this.gendr;
	}
}


