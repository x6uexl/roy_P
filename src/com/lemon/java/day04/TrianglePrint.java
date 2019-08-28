package com.lemon.java.day04;
/*
 * 打印直角三角形
 * *
 * **
 * ***
 * ****
 * *****
 */
public class TrianglePrint {
public static void main(String []args) {
	//外层来控制行数
	for (int i = 0; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
