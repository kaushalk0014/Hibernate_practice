package com.kk.spring.testfilesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjecctWriteInFile {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\FileSystemTest\\EmployeeObject.txt");
		file.createNewFile();
		FileOutputStream  fileOutputStream=new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(new Employee("kaushal","8084225043"));
		objectOutputStream.close();
		System.out.println("Done-------------------");
	}
}
