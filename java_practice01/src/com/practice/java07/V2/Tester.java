package com.practice.java07.V2;

public class Tester {
	public static void main(String[] args) {
		
		Cooker cooker= new Cooker();
		Doctor doctor= new Doctor();
		Teacher teacher= new Teacher();
		cooker.showDairly();
		System.out.println("-------");
		doctor.showDairly();
		System.out.println("-------");
		teacher.showDairly();
		System.out.println("-------");		
		
	}
	

}
