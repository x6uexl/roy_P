package com.practice.java06;

public class IPhone6  extends IPhone5{
public static void main(String[]args) {
		
		IPhone6 iphone6= new IPhone6();
		iphone6.sendMessage();
		System.out.println(iphone6.brand);
      }
   
   public  void shape() {
	   
	   System.out.println("iphone6特有的方法");
	   
   }


}
