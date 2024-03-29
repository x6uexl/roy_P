package com.lemome.java.maven.day03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;//反射方法

public class TestReflect {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {// 非法访问异常
		// 方法1 ：获取类的字节码
		Class<Student> class1 = Student.class;
		// 方法2：获取字节码
//		Class <Student> class2 = (Class<Student>) Class.forName("com.lemome.java.maven.day03.Student");
//  3.通过字节码通过 newInstance方法创建对象 底层其实调用的是字节码对应类中默认构造函数
		Student student = class1.newInstance();
//		Method [] methods=class1.getMethods();//引用类型的数组
//		for (Method method : methods) {
//			System.out.println(method.getName());
//          student.studen()
//		输出的这些方法：toString,getName,setName,getGendr,getAge,setAge,setGendr,wait,notifyAll,notify,wait,wait,equals,hashCode,	getClass	

		// method是setName方法的对象
		// 4.通过反射获取要调用的方法 用invoke方法
		Method method = class1.getMethod("setName", String.class);
		// 5.通过反射完成方法调用
		method.invoke(student, "zhangsan");// 通过invoke方法将传进去的数据 setName需要传数据
		// 6.通过getName取出来数据
		Method getNameMethod = class1.getMethod("getName");// getName没有实参
		Object value = getNameMethod.invoke(student);// 调用这个方法是否需要传数据 定义object
		// getName是形参 可变参数
		System.out.println("name=" + value.toString());

	}

}
