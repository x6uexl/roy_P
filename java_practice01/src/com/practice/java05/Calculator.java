package com.practice.java05;

import java.util.Scanner;

/**计算器：
 * 1.实现计算器的加减乘除功能，并且支持数据的输入
 * 2.要导出可执行jira包，通过bat批处理问卷来运行程序
 * 
 * @author roy
 *
 */
public class Calculator {
	
	private static Scanner scanner;

	/**
	 * 加法
	 * @param a
	 * @param b
	 * @return
	 */
 public  double add(double a ,double b) {
	 return a+b;
 }
 /**
  * 减法
  * @param a
  * @param b
  * @return
  */
 public  double substract(double a ,double b) {
	 return a-b;
 }
 
 /**
  * 乘法
  * @param a
  * @param b
  * @return
  */
 public  double  multiply(double a ,double b) {
	 return a*b;
 }
 
 /**
  * 除法
  * @param a
  * @param b
  * @return
  */
 public  double divide(double a ,double b) {
	 return a/b;

 }
 
     public static void main(String[]args ) {
    	 scanner = new Scanner(System.in);
//    	 Calculator calculator= new Calculator();
//    	 double a= 5;
//    	 double b =6;
    	 Calculator calculator = new Calculator();
    	     	 //输入第一个数据
    	 System.out.println("请输入第一个数据");
    	double a =  scanner.nextDouble();
    	         //输入运算符
    	System.out.println("请输入运算符");
    	String operator = scanner.next();
    	         //输入第二个数据
    	System.out.println("请输入第二个数据");
    	double b = scanner.nextDouble();
    	double result = 0.0;
    	       //根据输入的运算符调用相应的方法完成运算
    	if("+".equals(operator)) {
    		   //完成加法运算
    		result = calculator.add(a, b);   		
    	}else if ("-".equals(operator)) {
    		result = calculator.substract(a, b);
    	}else if ("*".equals(operator)) {
    		result = calculator.multiply(a, b);
    	}else if ("/".equals(operator)) {
    		result = calculator.divide(a, b);    		
    	}
    	      //输出结果   	 
    	 System.out.println("结果为："+result);
     }
}