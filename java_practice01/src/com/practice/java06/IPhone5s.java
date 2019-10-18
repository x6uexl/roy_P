package com.practice.java06;

public class IPhone5s  extends IPhone5{
	public static void main(String[]args) {
		
		IPhone5s iphone5s= new IPhone5s();
		iphone5s.sendMessage();
		System.out.println(iphone5s.brand);
		iphone5s.test();
		
	}
	public void fingerUnlock() {
	   System.out.println("指纹解锁");		   
	   }
	public String brand="iphone 5s";
	 
}
