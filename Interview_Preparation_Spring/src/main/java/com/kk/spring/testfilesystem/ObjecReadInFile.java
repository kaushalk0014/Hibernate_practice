package com.kk.spring.testfilesystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjecReadInFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("D:\\FileSystemTest\\EmployeeObject.txt");
		 
		
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Employee employee=(Employee) inputStream.readObject();
		System.out.println(employee);
		System.out.println("--------------------Done-------------------------");
	}
}
