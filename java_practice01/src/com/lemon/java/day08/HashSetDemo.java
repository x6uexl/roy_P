package com.lemon.java.day08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
 public static void main(String[] args) {
	 HashSet<String> set = new HashSet<String>();
	 set.add("张三");
	 set.add("李四");
	 set.add("王刘");
	 set.add("王刘");//hashcode值为一样则判断为一样的数据，hashset判断数据是重复的不可添加
	 System.out.println(set.size());
	 for(String string : set)  {
		 System.out.println(string);
		 
	 }
//	 System.out.println(set.size());
//	 System.out.println(set.isEmpty());
//	 System.out.println(set.isEmpty());
//	 set.add("王五");
//	 System.out.println(set.size());
//	Object[] objects=set.toArray();
//	for (Object object : objects) {
//	System.out.println(object);				
//	}
//	set.clear();//一次性删除所有数据
//	System.out.println(set.size());
//		 }
	//迭代（遍历）set集合
//    Iterator<String> ite = set.iterator();//获取迭代器
//    while(ite.hasNext()) {//判断是否有下一个数据
//    	
//    System.out.println(ite.next());//取出数据
//    
//    }
//     for(String name:set) {//循环删除数据
//    	 set.remove(name);
//    	 System.out.println(set.size());
//    	 
//     }
    
   
     
    
    }
   
    
}
