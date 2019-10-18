package com.lemone.java.maven.day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {// 通过代码复制文件
	public static void main(String[] args) throws IOException {
		String fromPath = "/Users/roy/Desktop/Test CaseCtrip.png";
		String toPath = "/Users/roy/Desktop/Test CaseCtrip2.png";
		InputStream inputStream = new FileInputStream(fromPath);// 读文件 输入流字节文件
		OutputStream outputStream = new FileOutputStream(toPath);// 写文件
		int size = 0;// 给写文件变量初始化
		while (inputStream.read() != -1) {
			outputStream.write(size);
		}
		if (inputStream != null) {// 当输入流不为空 则关闭inputstream
			inputStream.close();
		}
		if (outputStream != null) {// 当输出流不为空则关闭outputstream
		}
		System.out.println("finish");
	}

}
