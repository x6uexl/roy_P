package com.lemon.java.day09;

import com.lemone.java.day01.override;

public class Student {
		
		/**
		 * 姓名
		 */
		private static String name;
		/**
		 * 年龄
		 */
		private  static int age;
		/**
		 * 性别
		 */
		private  static String gender;
		//针对三个函数写set get方法
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		

		//带参构造函数，学生类接口（初始化对象 带参构造函数）
		public Student(String name,int age ,String gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			
		}
		//默认构造函数
		public Student() {
			
		}
		
		//覆盖父类的toString方法重写
		@override
		public String toString() {
			return "姓名: "+ this.getName() + "性别: "+ this.getAge() +"年龄: "+ this.gender;
			
			
		}

}
