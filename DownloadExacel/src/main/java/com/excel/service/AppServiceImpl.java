package com.excel.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.excel.bean.Employee;

@Service
public class AppServiceImpl implements AppService {
	static String[] HEADERs = { "ID", "Name", "salary"};
	static String SHEET = "Tutorials";

	@Override
	public Workbook load() {
		try {
			Workbook workbook = new XSSFWorkbook();
			ByteArrayOutputStream out = new ByteArrayOutputStream();

			Sheet sheet = workbook.createSheet(SHEET);

			// Header
			Row headerRow = sheet.createRow(0);

			for (int col = 0; col < HEADERs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(HEADERs[col]);
			}

			int rowIdx = 1;
			for (Employee employee : getEmployee()) {
				Row row = sheet.createRow(rowIdx++);

				row.createCell(0).setCellValue(employee.getEmpId());
				row.createCell(1).setCellValue(employee.getName());
				row.createCell(2).setCellValue(employee.getSalary());
			}

			workbook.write(out);
			//return new ByteArrayInputStream(out.toByteArray());
			return  workbook;
		} catch (IOException e) {
			throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		}
	}

	private List<Employee> getEmployee() {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Kaushal","5000"));
		list.add(new Employee(102,"Rahul","10000"));
		list.add(new Employee(103,"Dinesh","5000"));
		list.add(new Employee(104,"Sulekha","8000"));
		list.add(new Employee(105,"Sweta","70000"));
		return list;
	}

}
