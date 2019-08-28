package com.lemone.java.day02;

public class Operator {
	public static void main(String []args) {
		int a = 1;//当计算a/b时 需要将a，b 都定义为double 类型，这样结果才不是0；
		int b =2;
		++a;//2
		a++;//3
		System.out.println(a+b);//5
		System.out.println(a-b);//1
		System.out.println(a*b);//6
		System.out.println(a/b);//1
		System.out.println(a%b);//1
		//不管++自增运算符是写在变量前面还是变量后面，此处都只是输出a变量的值，但是
		//如果++运算符放前面，那么变量会为运算符的位置，会先+1，这个时候拿变量值取用的时候就是2；反之，如果在后面
		//的值去用的时候就是1
		System.out.println(a++);//3
		System.out.println(++a);//5
		System.out.println(a);//5
		System.out.println(a);//5
		System.out.println(a==b);
		System.out.println(a!=b);
	}

}
