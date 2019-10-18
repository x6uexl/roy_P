package com.lemon.java.day04;

import org.omg.CORBA.ORBPackage.InconsistentTypeCode;
/*
 *多个if并列使用，判断原则：从上往下执行，不管是否满足执行效率低
 *if else if...else 按照顺序来判断，一旦满足某个条件，就不再执行其他
 */
public class IfDemo {
	public static void main(String []args) {
//		int score = 85;
//		if (score >=85) {
//		System.out.println("A ");			
//		}else {
//			if (score >=60&&score<85) {
//				System.out.println("B");				
//			}else {
//				System.out.println("C");
//			}
//		}		
//	}
//	三目运算符A>B?:C
	int a =1;
	int b=2;
	if (a>b) {
		System.out.println("大于");
	}else  {
		System.out.println("小于等于");		
	}
	System.out.println("++++++++++++");
	//判断A是否大于B，如果大于就输出“大于”；否则输出“小于等于”
	System.out.println(a>b?"大于":"小于等于");
	}
}
