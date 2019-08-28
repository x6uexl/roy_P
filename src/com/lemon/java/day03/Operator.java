package com.lemon.java.day03;

public class Operator {
	public static  void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
//		System.out.println((a>b)&(b>c));
//		//当且仅当两边都为真，结果才为真，当左边为假了，那么后面的表达式就不会执行
//		System.out.println((a>b)&&(++b>c));//验证是否走到b>c的表达式，则可以++b；输出b的值
//	    System.out.println(b);//结果为2
//	    //逻辑或：任何一边操作数为真，最后结果为真，当且仅当两边都为假，才为假
//	    System.out.println((a<b)|(b<c));
//	    System.out.println((a<b)||(++b<c));
//	    System.out.println(b);
//	    //取反值
//	    System.out.println(!(a<b));
//	     a+=1;//a=a+1 将运算结果赋值给左边的变量
//	     System.out.println(a);//2
//	     a-=1;//a=a-1
//	     System.out.println(a);
//	     a*=1;//a=a*1
//	     System.out.println(a);
//	     a/=1;//a=a/1
//	     System.out.println(a);
//	     a%=1; //a=a%1	因为a为单精度 结果为0   
//	   System.out.println(a);
       //三目运算符A?B:C--》A，B，C依次为表达式，而且A是一个条件表达式，经过运算会得到一个boolean类型的值；
	   //如果值为true，就执行B表达式，否则就执行C表达式
       //System.out.println(a<b?"小于":"大于");
       System.out.println(a<b?++a:a++);//2
       System.out.println(a>b?++a:a++);//2
       System.out.println(a);//3
       
	    		 
	     
			 
	} 

}
