package com.practice.java04;

public class ZuoYeDaYingAJX {
	public static void main(String[]args) {
//		//用外层循环来控制行数
//		for(int i=1;i<=5;i++) {
//			for (int j=1;j<=i;j++) {//用内存循环来控i
//				
//				System.out.print("*");	
//			}
//			//输出完一行内容后再换行
//			System.out.println();			
//			
//		}
//	int Jishuhe =0;
//	int oushuhe =0;
//	for (int i= 0; i<=100; i++) {
//		//判断是否为偶数
//		if(i%2==0) {
//			oushuhe+=i;
//			}else { 
//				Jishuhe+=i;
//			    }
//		System.out.println("基数和:"+Jishuhe);
//		System.out.println("偶数和:"+oushuhe);		
//	    }
		
		//用外层来控制行数
for (int i =1; i <=5; i++) {//现定义一个i，控制外层循环
	for(int j=1;j <=5-i; j++) {//j控制*输出
		System.out.print(" ");
		}
	for (int j =1;j<=i;j++) {
		System.out.print("* ");		
	}
	//换行
	System.out.println();
	
	
	
	
}
	
	
	}
}
