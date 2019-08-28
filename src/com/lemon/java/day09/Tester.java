package com.lemon.java.day09;

public class Tester extends Parent {
	//非静态的全局变量 。函数无法访问到（当没有static）
	private  static String name = "zhangsan";
	
	
     static {//静态代码块完成数据初始化
    	 System.out.println("静态代码块");
     }
     
	public static void main(String[] args) {	
		Tester tester = new Tester();
		System.out.println("Tester.sayHi(HI)");
//		Student  student1= new Student("测试1",18,"男");
//		Student student2= new Student("测试2",18,"女");
//		System.out.println(student1);
//		System.out.println(student2);
		//Tester tester  =new  Tester();
		
//		Tester.sayHi();
	}
	
	public Tester() {
		
		System.out.println("Tester.Tester");
	}
	/**
	 * 工具方法   static 修饰一个函数直接拿类名调用不用创建对象 方便调用，快速解决问题
	 */
	//静态可以不用创建对象调      非静态必须通过类名调用函数
	// public   void  sayHi()
    public  static void  sayHi() {
    	System.out.println("Tester.sayHi(HI)");
    	
    	
    }
}
	
	
	

