package com.lemon.java.day04;
public class ForDemo {
	public static void main(String [] args) {
//		for(int i=1;i<=10;i++){//定义一个变量i 整数
//			System.out.println(i);//打印每一个变量i的值			
//		}
		//求1-10的和；
//        int result = 1+2+3+4+5+6+7+8+9+10;
//        System.out.println(result);
//        //	求1-100的和；
//		int result1=0;
//		for (int i = 1; i<=100; i++) {
//			result1 +=i;			
//		}
//		System.out.println(result1);
		// 若将初始值为result1=1 则结果result1-1
//		int result1=1;
//		for (int i = 1; i<=100; i++) {
//			result1 +=i;//result1=result1+1			
//		}
//		System.out.println(result1-1);//从1+2+3.....+100		
		String [] names = {"aa","bb","cc"};
//	for (int i = 0; i < names.length; i++) {	
//		System.out.println(names [i]);//打印输出数组类型
//}	//System.out.println(names.length);//打印出这个数组的长度
//	增强for循环
//		for(String name:names) {
//			System.out.println(name);
		//当i为3时 跳过本次循环
		for(int i = 1;i<=5;i++) {
		if (i==3) {
//				continue;
//			}
//			System.out.println(i);//输出1245
//		}
		//当i 为3时终止本次循环
			for (int j = 0; j < 5; j++) {
				if (j==3) {
					break;//循环break continue				
				}
				System.out.println(j);//打印出012；如果要打印出0123 则将syso输出语句放在if前面
			}				
		}
			
	}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
