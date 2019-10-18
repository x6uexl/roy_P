package com.lemone.java.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork {
	public static void main(String[] srgs) {	
		HomeWork homeWork = new HomeWork();
		homeWork.test2();
		
	}
	
	public void test2() {
		Map<String,ArrayList<Student>> map = new HashMap<String,ArrayList<Student>>();
		ArrayList<Student> list = new ArrayList<Student>();
		Student studentA = new Student("ceshi1",18,"男");
		Student studentB  = new Student("ceshi2",16,"女");
		Student studentC = new Student("ceshi3",15,"男");
		//将student信息保存到arraylist中
		list.add(studentA);
		list.add(studentB);
		list.add(studentC);
		String class1 = "1801";
		map.put(class1, list);		
		Student studentD  = new Student("ceshi5",16,"女");
		Student studentE = new Student("ceshi6",15,"男");
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(studentD);
		list2.add(studentE);
		String class2 = "1802";
		map.put(class2, list2);
		//遍历
		Set<String> classNames = map.keySet();
		for(String ClassName : classNames) {
			System.out.println("班级姓名: "+classNames);
			List<Student> list3 = map.get(ClassName);
			for (Student student : list3) {
				System.out.println(student);
				
			}
			
		}
		
	}
	
	public void test1() {
		Student student1 = new Student("zhangsan",18,"女");
		Student student2 = new Student("lisi",18,"男");
		Student student3 = new Student("linlin",18,"女");
		ArrayList<Student>  list = new ArrayList<Student>();
	    //添加三个学生对象
		list.add(student1);
	    list.add(student2);
	    list.add(student3);
	    //删除第三个学生对象方法1
	    //list.remove(2);
	    //删除第三个学生对象
	    list.remove(student3);
	  //将第一个学生姓名改成ceshi
	    //list.get(0).setName("ceshi");
	    //变更学生姓名第二张方法用list.get
	    //从集合取出遍历 没有额外的创建变量
		 student1 = list.get(0);
		student1.setName("ceshi");
		//循环遍历 i =最大长度-1
		for (int i =0;i<list.size();i++) {
			Student student = list.get(i);
			System.out.println("姓名: "+student.getName()+ "年龄: "+student.getAge()+ "性别: "+student.getGender());
          }
//			//调用父类的object 的tostring方法 重写父类
		for (int i =0;i<list.size();i++) {
			Student student = list.get(i);
			System.out.println(student.toString());
		}
		
//		//增强for循环遍历
		for (Student  student: list) {
			System.out.println(student);
		}
//		//Iterator接口 第三种方法
		Iterator<Student>  iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student);		
		}

	}
}


		
