package com.practice.java06;

public class IPhone5  extends IPhone4s{
	public static void main(String[] args) { 
		IPhone5 iphone5= new IPhone5();
		iphone5.sendMessage();
		System.out.println(iphone5.brand);
		
		iphone5.test();
		}
//	public void fingerUnlock() {
//		   System.out.println("指纹解锁");		   
//	   }
    public String brand="iphone5";  	
       //@Override 重写
 
    public void test() {
    	System.out.println("子类的测试方法");  	
    	
    }
    public IPhone5() {
    	System.out.println("Iphone5.Iphone5()");
    	
    	
    }
}
