package com.excel.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.excel.service.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService appService;

	@GetMapping(value = "/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public void getFile(HttpSession session, HttpServletResponse response) throws IllegalStateException, IOException {

		String filename = "tutorials.xlsx";
		Workbook workbook = appService.load();
		response.setContentType("application/vnd.ms-excel");
		response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename);
		workbook.write(response.getOutputStream());
	}

	@GetMapping("/home")
	public ModelAndView welcomePage() {
		return new ModelAndView("index");
	}

}
