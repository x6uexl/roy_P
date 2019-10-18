package com.practice.java04;

public class ForDemo {
	
	public static void main(String[]args) {
		//		for (int i=1;i<=10;i++) {//i代表一个整数
//		System.out.println(i);//打印每一个变量i的值									
//		}
//		//求1-100的和
//		int result=0;
//		for(int i=1;i<=100;i++) {
//			result+=i;//0+1+2+3....+99+100
//		}
////		System.out.println(result);
//         String [] names= {"aa","bb","cc"};//取出数组里面的内容
////         for(int i=0;i<=names.length;i++) {//利用索引取出
//////        	 System.out.println(names[i]);       	 
////         }
////         //增强for循环
////	      for(String name:names) {//定义一个类，String， 将names数组的值传给name 输出
////	    	  System.out.println(name);
////	      }
//		for (int i=1;i<=5;i++) {
//			if(i==3) {
//				 continue;//continue跳过本次循环
//			} 
//			//当为3时候跳过本次循环
//			System.out.println(i);
//			
//		}
         
		for (int i=1;i<=5;i++) {
			//当为3时候跳过break循环
			System.out.println(i);
			if(i==3) {
				 break;//break跳过本次循环
			} 
			
			
		}
		
	}
}



