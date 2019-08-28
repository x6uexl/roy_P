package com.lemon.java.day04;
/*
 * 求0-100的偶数和, 奇数和
 */
public class Evenumber {
public static void main(String [] args) {
//用一个数%2（莫余）为0 则为偶数否则就为奇数
	 int evenadd=0;//偶数和
	 int  oldadd=0;//奇数和
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				evenadd+=i;				
			}else {
				oldadd+=i;
			}			
		}
		System.out.println("偶数和:"+evenadd);
		System.out.println("奇数和:"+oldadd);		
    }
}
