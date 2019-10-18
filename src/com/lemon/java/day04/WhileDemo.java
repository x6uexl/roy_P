package com.lemon.java.day04;
/*do{...
 * }while(条件1);
 * while(条件2){....
 * }
 * 二者的区别：do...while 不管条件满不满足，它是先执行再判断条件，所以循环体里的代码至少执行一次；
 * while 只有再条件满足的情况下才会执行
 */
public class WhileDemo {
	public static void main(String []args) {
//		int i =-1;
//		do {
//			System.out.println(i);//-1,0,1,2,3,4,5
//			i++;//0,1,2,3,4,5,6
//			
//		} while (i>=0&&i<=5);//-1,0,1,2,3,4,5
//		
//		//System.out.println(i);//-1,0,1,2,3,4,5,6
//				
		int a=-2;
		while(a>=0&&a<=5) {//a==-1不满足while条件则不会走到while循环里面
			++a;							
		}	
		System.out.println(a);//输出a的值为-1	
	}
}
