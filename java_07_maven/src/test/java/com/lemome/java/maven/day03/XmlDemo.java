package com.lemome.java.maven.day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlDemo {
	public static void main(String[] args) throws Exception {	String path = "src/test/resources/student.xml";		
		parseXml(path);
	}

	private static void parseXml(String path) throws Exception {
		// 创建解析器SaxReader
		SAXReader reader = new SAXReader();

//		获取document
		Document document = reader.read(new File(path));

//		获取根元素  根元素是element类型
		Element root = document.getRootElement();
//		获取根元素下的子元素  页面上所有元素都是element类型
		
		List<Element> studentsElements = root.elements("student");
		int i = 0;
		// 通过for循环处理三个根节点下的student元素 取出类sutdents的子元素
		for (Element studentElement : studentsElements) {
			i++;
			System.out.println("处理第【" + i + "】个student元素");
//			Element nameElement = studentElement.element("name");
//			Element agElement = studentElement.element("age");
//			Element genderElement = studentElement.element("gender");
//			// 取出元素的文本内容
//			String name = nameElement.getText();
//			String age = agElement.getText();
//			String gender = genderElement.getText();		
		//还这可以这么写
			String name= studentElement.elementText("name");
			String age= studentElement.elementText("age");
			String gender= studentElement.elementText("gender");			
			System.out.println("nage=" + name + ",age=" + age + ",gender=" + gender);

		}

	}

}
