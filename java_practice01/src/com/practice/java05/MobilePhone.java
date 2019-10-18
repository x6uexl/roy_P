package com.practice.java05;

/**手机类
 * 
 * @author roy
 *
 */

public class MobilePhone {
	public interface Mobilephone {

	}
	private static final int i = 0;
	/**
	 * 品牌
	 */
public String getBrand() {
	return this.Brand;		
}


public String getGeneration() {
	return this.generation;	
}

public int  getPrcie() {
	return this.price;	
	
}


/**
 * 产品类型
 */
public String generation;
public void setGeneration(String generation) {
	this.generation =  generation;	
}
/**
 * 价格
 */
public int price;
private String Brand;
private static int price3;

public void setPrice(int price) {
	this.price =  price;	
}
/**
 * 给手机设置品牌
 * @param name
 */
public void setBrand(String brand) {
	this.Brand =  brand;	
}

public void sendMessage(String name) {//短信发给多个人 name当作参数
	System.out.println(name+",空吗一起吃饭");
	System.out.println("-----通过【"+this.Brand+this.generation+"】手机发出");
	}
//this 默认一个对象
/**
 * 无参构造函数(默认构造函数)
 */
public MobilePhone() {
	}
public MobilePhone(String brand,String generation,int price) {
	this.Brand=brand;
	this.generation=generation;
	this.price=price;	
	}
public static  void main(String [] args) {
	MobilePhone mobilephone = new MobilePhone("华为","P20",1111);
	String name="小明";
	mobilephone.sendMessage(name);
	String name2="小王";
	mobilephone.sendMessage(name2);
	//MobilePhone mobilephone1 = new MobilePhone();
	//mobilephone1.grade(70);
	MobilePhone mobilephone3 = new MobilePhone();
	//给mobilephone3设置一个品牌：小米
	mobilephone3.setBrand("小米");
	//给mobilephone3设置一个型号：2
	mobilephone3.setGeneration("2");
	//给mobilephone3设置一个价格：888
	mobilephone3.setPrice(888);
	//取monilephone3的品牌信息
     String brand3= mobilephone3.getBrand();
     //取mobilephone3的型号
	String genration3= mobilephone3.getGeneration();
	setPrice3(mobilephone3.getPrcie());
	System.out.println("brand3="+brand3+",genration3="+genration3+",price3=+price3");
	
	}
//根据学员分数判断成绩，并将成绩登记输出来
//public void grade(int score) {
//	if(score<60) {
//		System.out.println("c");
//	}else if (score>=60 && score<=80) {
//		System.out.println("b");
//	}else {
//		
//		System.out.println("a");
//	}
//	
//	
//}


public static int getPrice3() {
	return price3;
}


public static void setPrice3(int price3) {
	MobilePhone.price3 = price3;
}


public static int getI() {
	return i;
}

//以下三个函数重载
public void setMobileInfo(String brand) {
	this.Brand = brand;
	
}
public void setMobileInfo(String brand,String generation) {
	this.Brand =  brand;
	this.generation = generation;
}
public void setMobileinfo(String brand,String generation,int price) {
	this.Brand = brand;
	this.generation = generation;
	this.price = price;
}



}

