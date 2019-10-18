package com.practice.java07.V2;

public abstract class Worker {
	/*
	 * 工作方法
	 */
public abstract void work();
	/*
	 * 显示一天的日常
	 */
	public void showDairly() {
		System.out.println("起床");
		System.out.println("上班");
		work();
		System.out.println("下班");
		System.out.println("睡觉");
		
	}
	

}
