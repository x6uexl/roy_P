package com.practice.java04;

public class IfElseDemo {
	public static void main(String[]args) {
		int score = 85;
//		if (score>=60) {System.out.println("及格了");}
//		else {System.out.println("没几个");}
//		
//		if(score>=85) {
//			System.out.println("优秀");
//		}else if(score>=60&&score<85) {
//			System.out.println("及格了，仍需努力");
//		}else {
//			System.out.println("没及格");
//		}		
		//A?B:C
		int a=1;
		int b =2;
		//判断a是否大于b，如果大于就输出“大于”，否则输出“小于等于”
		if(a>b) {
			System.out.println("大于");
		}else {
			System.out.println("小于等于");
		}
		System.out.println(a>b?"大于":"小于等于");
	}
	
	
	
}
	
