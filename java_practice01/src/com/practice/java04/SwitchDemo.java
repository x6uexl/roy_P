package com.practice.java04;
/*根据月份来输出季节
 * 
 * 
 * 
 */
public class SwitchDemo {//switch 语法不支持long类型的变量
	public static void main(String[]args) {
		int month = 7;
		switch (month) {
		case 7:
			System.out.print("春季");
		break;
		
		case 8:
			System.out.print("夏季");
		break;
		
		case 9:
			System.out.print("秋季");
		break;
		case 10:
			System.out.print("冬季");
		break;
		case 11:
			System.out.print("冬季");
		break;
		default:
		System.out.println("没有此月份，请检查输入");
		break;
		
				
		}
		
	}

}
