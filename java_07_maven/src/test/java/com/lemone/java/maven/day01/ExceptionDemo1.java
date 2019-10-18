package com.lemone.java.maven.day01;
//运行时异常抛出
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExceptionDemo1 {
	public static void main(String[] args) throws IOException {
		// 获取properties对象 properties用来解析properties文件的内容
		Properties properties = new Properties();
		// 根据文件路径创建文件对象
		File file = new File("src/test/resources/log4j.properties");
		// 这个是多肽的写法 iStream是InputStream的子类
		// 传入文件对象准备输入流对象
		InputStream iStream = new FileInputStream(file);
		// 调用load方法从输入流中加载到对象中 ：流对象
		properties.load(iStream);
		System.out.println(properties.getProperty("log4j.rootLogger"));

	}

}
