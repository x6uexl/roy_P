package com.lemon.java.day09;

public class Tester1 {
	public static void main(String[]args) {
		
		Student student1 =  new Student("zhangsan",25,"男");
		Student student2 = student1;
		student1.setName("李四");
		System.out.println(student1);
		System.out.println(student2);		
		
		
		
	}

}
