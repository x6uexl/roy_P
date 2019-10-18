package com.lemone.java.maven.day01;

import java.util.List;

//运行时异常
public class ExceptionDemo2 {
	public static void main(String[] args) {
		//IndexOutOfBoundsException 运行时异常
		List<String> names = null;
		names.add("xxl");
		names.add("xx");
		System.err.println(names.get(3));
		
	}
	

}
