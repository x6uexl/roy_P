package com.practice.java04;

public class ZuoYongYu {
	//成员变量（全部变量）
	String name="zhangsan";
	//全局变量
	int age = 24;
	public static void main(String[]args) {
		int a =1;
		int b = 2;
		//局部变量，此变量局限与最近的一堆{} 这里输出25
		int age=25;
		System.out.println(age);				
	}
	public void test() {
	//System.out.println(a);//这里不会输出a的值	
     System.out.println(name);		
	}
	
	
	
	

}
