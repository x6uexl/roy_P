package com.practice.java04;

public class whileDemo {
	public static void main(String[]args) {
		int x = -1;
//		do {//不管是否满足条件都执行；
//			System.out.println(x);//-1,0,1,2,3,4,5
//			x++;//0
//			}while (x>=0&&x<=5);//0,1,2,3,4,5
//		//System.out.println("===");
//		System.out.println(x);
		
		while(x>=0&&x<=5) {//当X=-1的时候不满足条件，则不执行while循环体里面的代码
			System.out.println(x);
			x++;		
		}
		System.out.println("====");//直接输出正则符
		System.out.println(x);//输出X的值=-1
		
	}

}
