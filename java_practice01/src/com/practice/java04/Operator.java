package com.practice.java04;

public class Operator {
	public static void main(String []args) {
		int a =1;
		int b=2;
		int c=3;
//		System.out.println((a>b)&(++b<c));//false
//		//逻辑与：当且紧当两边都为真，最后结果才为真，当左边为假类，那么后面表达式就不会知执行类，这就是短路的理解，短路&
//		System.out.println((a>b)&&(++b<c));
//		System.out.println(b);		
//		//逻辑或：任何一边操作数为真，最后结果为真，当且仅两边都为假，才为假；
//		System.out.println((a<b)|(b<c));
//		System.out.println((a>b)|(b<c));
//		System.out.println((a>b)||(++b>c));
//		System.out.println(b);//b=3
//		//逻辑非：取反
//		System.out.println(!(a>b));
//		  a+=1;//a=a+1
//		System.out.println(a);//2
//		a-=1;
//		System.out.println(a);//1
//		a*=1;
//		System.out.println(a);//1
//		a/=1;
//		System.out.println(a);//1
//		a%=1;
//		System.out.println(a);//0		
		//三目运算符:A?B:C--->A,B,C依次为表达式，而且A是一个条件表达式，经过运算会得到一个boolean类型的值，
		//如果值为true，就执行B表达式，否则就执行C表达式
		System.out.println((a>b)?"大于":"小于");
		
		System.out.println((a<b)?++a:--a);//2
		System.out.println(a);//2
		
		System.out.println((a<b)?a++:--a);//1
		System.out.println(a);//2
		
		
		
		
		
	}

}
