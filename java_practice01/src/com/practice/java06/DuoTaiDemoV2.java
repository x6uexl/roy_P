package com.practice.java06;

import com.practice.java04.Mobile;

public class DuoTaiDemoV2 {
	/*
	 * 输出所有iPhone手机品牌信息
	 */	
	public void showMobileBrand(Mobile mobile){
		mobile.brand();
		}
public static void main(String[] args) {
	DuoTaiDemoV2 duotaiDemo = new DuoTaiDemoV2();
			//想知道IPhone4S的品牌信息
	IPhone4s iphone4s =new IPhone4s();
	duotaiDemo.showMobileBrand(iphone4s);
	//想知道iphone5的品牌信息
	IPhone5 iphone5 = new IPhone5();
	duotaiDemo.showMobileBrand(iphone5);
    //想知道iphone5s的品牌信息
	IPhone5s iphone5s = new IPhone5s();
	duotaiDemo.showMobileBrand(iphone5s);
	//想知道iphone6的品牌信息
		IPhone6 iphone6 = new IPhone6();
		duotaiDemo.showMobileBrand(iphone6);
}
private void showMobileBrand(IPhone4s iphone4s) {
	// TODO Auto-generated method stub
	
}
}
