package com.lemon.java.day09;

import com.lemone.java.day01.override;

public class Test2 extends Test3{
	/**
	 * final最终的意思
	 * @param args
	 */
	public final int  age = 25;
  public static void main(String[]args) {
	  Test3 test3=new Test3();
	  
	  System.out.println(test3.name);
  }
//	public void test() {  被final定义的变量不能被修改
//		age = 26;
//		
//		
//	}
//  //被final 修复的方法不能被重现
//     @override
//      public  void test() {
//    	 System.out.println("Test2.test()");
//    	 
//    	 
//     }
	
}
