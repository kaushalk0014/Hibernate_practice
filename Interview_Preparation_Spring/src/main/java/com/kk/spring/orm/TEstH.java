package com.kk.spring.orm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TEstH {
	public static void main(String[] args) throws IOException {
		File file=new File("");
		FileOutputStream  fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new Employee("kaushal","8084225043"));
		objectOutputStream.close();
	}
}
