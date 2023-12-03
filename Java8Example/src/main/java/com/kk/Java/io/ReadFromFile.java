package com.kk.Java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		File file = new File(
				"D:\\kaushal\\AtHome_2020\\Java8Example\\src\\main\\java\\com\\kk\\Java\\io\\application.txt");

		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String str;
		int len = 0;
		String tempString=null;
		while ((str = bufferedReader.readLine()) != null) {
			String[] strArr = str.split(" ");
			for (String string : strArr) {
				if (len == 0) {
					len = string.length();
					tempString=string;
				}
				if (string.length() > len) {
					len = string.length();
					tempString=string;
				}

			}

		}
		bufferedReader.close();
		System.out.println(" String is :"+tempString +"  Length is: " + len);

	}
}
