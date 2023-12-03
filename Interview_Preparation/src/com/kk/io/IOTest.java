package com.kk.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest {

	public static void main(String[] args) throws IOException {
		InputStream inputStream=new FileInputStream("");
		System.out.println(inputStream.read());
	}
}
