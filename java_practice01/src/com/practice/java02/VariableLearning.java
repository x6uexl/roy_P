package com.practice.java02;

public class VariableLearning {
	public static void main(String []args) {
		//========================================
		//八大基本数据类型
		//定义一个布尔类型的变量
		boolean aa =true;//=表示赋值运算符
		//整型
		byte bb=1;
		short cc =2;
		int dd=3;
		long ee=4;
		//浮点型
		float ff=3.14145f;//float ff=(float)3.14 小数默认被提升为了double类型（8个字节)，这个过程叫强子转换
		//因此大类型转化为小类型，必须要向下强制转换，次过程是需要手动强制完成的
		double gg=3.14;
		//字符型
		char hh='1';
		//==========================================
		//引用类型,字符串
		String  name="roy";
		 int  age =22;
		 System.out.println(name + age);
		 //==========================================
		 //数组
		//一维数组
		//场景：创建了一个数组，但是没有初始化数组的元素，这种情况下需要制定数组的大小
		//语法：数据类型[]    数组名 = new 数据类型[size]
		 int [] arr1 = new int[5];//int类型的默认值为0,所以此数组李萌会有5个默认值，都是0；
		 //场景：创建一个数组，并已知数组的内部元素
		 //语法：类型[] 数组名={...};
		 //eg:定一个数组，已知数组要保存的三个姓名：张三 李四 王五
		 //赋值==========================================
		 String[] names= {"张三","李四","王五"};
		 
		 
//		 //60.70.80.90.100
//		 arr1[0]=60;
//		 arr1[1]=70;
//		 arr1[2]=80;
//		 arr1[3]=90;
//		 arr1[4]=100;
//		 //取值===========================================
//		 System.out.println(arr1[0]);
//		 System.out.println(arr1[1]);
//		 System.out.println(arr1[2]);
//		 System.out.println(arr1[3]);
////		 System.out.println(arr1[4]);
////		 System.out.println(arr1[5]);
//		 System.out.println(names[0]);
//		 System.out.println(names [1]);
//		 System.out.println(names [2]);
		 //取出数组的长度
//		 System.out.println(names.length);
//        //二维数组
//		 String [][] names2= {{"张三","李四"},{"一粒","利益"},{"力度","第三"},{"史蒂夫","舒服"}};
//		 String [][] names3={{"张三","李四"},{"一粒","利益","sd"},{"力度","第三","ewtr"},{"史蒂夫","舒服","wdlsf"}};
		 //创建一个数组，但是没有初始化数组的元素。这种情况需要显示指定数组的大小
		 String [][] arr2= new String[3][2];
		 //创建一个数组，已知数组内部的每个数组的所以元素
		 String [][] arr3={{"张三","李四"},{"一粒","利益"},{"力度","第三"},{"史蒂夫","舒服"}};
		 String [][] arr4={{"张三","李四"},{"一粒","利益","sd"},{"力度","第三","ewtr"},{"史蒂夫","舒服","wdlsf"}};
//		 System.out.println(arr2[0][0]);
//		 System.out.println(arr2[0][1]);
//		 System.out.println(arr2[1][0]);
//		 System.out.println(arr2[1][1]);
//		 System.out.println(arr2[2][0]);
//		 System.out.println(arr2[2][1]);
		 //4个数组，然后舒服在第二个则，索引为 行标4-1=3；列标2-1=1
		 System.out.println(arr4[3][1]);
		 
	}

}
