package com.kk.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kk.test.entity.BankDO;
import com.kk.test.service.MockitService;

@RestController
@CrossOrigin
public class MocitoController {
	
	 
	@Autowired
	private MockitService mockitService;
	
	@RequestMapping(value = "bank",method = RequestMethod.POST)
	public ResponseEntity<BankDO> save(@RequestBody BankDO bankDO){
		bankDO=mockitService.save(bankDO);
		return new ResponseEntity<BankDO>(bankDO,HttpStatus.OK);
	}
	
	@RequestMapping(value = "bank",method = RequestMethod.GET)
	public ResponseEntity<BankDO> get(@RequestParam Long id){
		BankDO bankDO=new BankDO();
		bankDO=mockitService.getById(id);
		return new ResponseEntity<BankDO>(bankDO,HttpStatus.OK);
	}
	@RequestMapping(value = "bank/getAll",method = RequestMethod.GET)
	public ResponseEntity<List<BankDO>> getAll(){
		List<BankDO> bankDO=new ArrayList<BankDO>();
		bankDO=mockitService.getAll();
		return new ResponseEntity<List<BankDO>>(bankDO,HttpStatus.OK);
	}
}
