package com.lemone.java.maven.day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//编译时异常捕捉异常

public class TryCatch {
	
	public static void main(String[] args) throws FileNotFoundException  {
		Properties properties = new Properties();
		File file =new File("src/test/resources/log4j1.properties");	//将路径写错	
		try {
			InputStream inStream = new FileInputStream(file);
			properties.load(inStream);
		} catch (Exception e) {
			System.out.println("properties文件解析异常");

		}
		System.out.println(properties.getProperty("log4j.rootLogger"));			

		
		
	}

}