package com.practice.java07.V2;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String [] args) {
		HashMap<String,String> map = new HashMap<String,String>();		
		System.out.println(map.size());//查看到底有多少健值对
		map.put("name","名扬");//存数据
		map.put("age","18");
//		String name =map.get("name");//取数据
//		String age = map.get("age");
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(map.size());
//		String name =map.remove("name");
//		System.out.println(name);
//		System.out.println(map.get("name"));
//		map.containsKey("gender");//判断是否包含那个健值
//		System.out.println(map.containsKey("name"));
//		System.out.println(map.containsValue("18"));
//		Set<String>  keys = map.keySet();//key值是唯一的 不可重复
//		for (String key : keys) {
//			System.out.println("key="+key);		
//		}
		
//	Collection<String> collection =	map.values();
//	for (String value : collection) {
//		System.out.println(value);		
//	}
	
	//迭代 遍历map，依次拿出map中所有的健值对
//	Set <String> keys = map.keySet();
//	for (String  key : keys) {
//		String value  map.get(key);
//		System.out.println("key:"+key+",value:"+value);
//		}
	//entry--代表一个key_value 健值对
//	Set<java.util.Map.Entry<String, String>> entries = map.entrySet();
//	for (java.util.Map.Entry<String, String> entry:entries) {
//		System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());	
//	}
		map.put("name","小样儿");
		System.out.println(map.get("name"));
		String [] names = {"aa","bb","cc"};
		
	}

}
