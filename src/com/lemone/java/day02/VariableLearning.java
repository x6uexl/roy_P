package com.lemone.java.day02;

import java.sql.Array;

public class VariableLearning {
	public static void main(String[] args) {
		// 定义布尔类型的比变量
		boolean aa = true;// 表示赋值运算符
		// 整型
		byte bb = 1;
		short cc = 2;
		int dd = 5;
		long ee = 6;
		// 浮点型
		float ff = 1.6778f;// 小数默认被提升为double类型（8个字节）这个过程叫类型向上转换
		// float，因此大类型转化为小类型，必须要向下强制转化，此过程需要手动强制完成
		double gg = 3.14;
		// 字符型
		char hh = '1';// char类型一定要单引号，且字符长度只为1
		// 引用类型 String：字符串
		String name = "roy";
		int age = 23;

		// 数组
		// 一维数组
		// 场景：创建一个数组 但是没有初始化数组的元素 这种情况需要现实指定数组的大小
		// 语法：数据类型[] 数组名 = new 数组类型 [size]
		int[] arr1 = new int[5];
		// 场景：创建一个数组 并已知数组的内部元素
		// 语法：数据类型[] 数组名 = {...}
		// 定一个数组 已知数组要保存三个姓名：张三 莉丝 王五
		String[] names = { "zhangsan", "lisi" };
		System.out.println(names.length);
		// 取出一维数组的值60,70,80,90,100
		// arr1[0] = 60;
		// arr1[1] = 70;
		// arr1[2] = 80;
		// arr1[3] = 00;
		// arr1[4] = 100;
		// 二维数组：两行两列
		String[][] arr6 = { { "xxl", "ceshi" },{ "sddsf", "asd" }};
		// 创建一个数组 但是没有初始化数组的元素，这种情况需要现实指定数组的大小
		String[][] arr2 = new String[4][3];
		// 创建一个数组 并已知 数组内的每个数组的所有元素
		String[][] arr3 = { { "姓名", "zhangsan" }, { "年龄", "job", "19" }, { "地址", "enjos", "shanghai" } };
		// 取出第一行第一列数据
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[1][0]);
		System.out.println(arr2[1][1]);
		System.out.println(arr2[1][2]);
		System.out.println(arr2[2][0]);
		System.out.println(arr2[2][1]);
		arr2[1][1] = "数值";
		// 取出第二行第二列的数
		System.out.println(arr2[1][1]);

	}

}
