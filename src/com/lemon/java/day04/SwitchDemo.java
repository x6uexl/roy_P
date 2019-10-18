package com.lemon.java.day04;
/*注意：switch 语句能够接受的变量类型是有限的，就是说只能是：switch 中case 的常用参数类型：char byte short 逆天
String enum （枚举）  
 * 
 */
public class SwitchDemo {
	public static void main(String []args) {
		int month =7;
		switch (month) {
		case 1:
			System.out.println("春季");
			break;
		case 2:
			System.out.println("夏季");
			break;
		case 3:
			System.out.println("秋季");
			break;
		case 4:
			System.out.println("冬季");
			break;

		default :
		  System.out.println("没有此选择项");
			break;
		}
	}

}
