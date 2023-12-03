package com.kk.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table(name = "My_Bank")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class BankDO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "company_genetator", strategy = "increment")
	@GeneratedValue(generator = "company_genetator")
	@Column(name = "bank_id")
	private Long bankId;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "address")
	private String bankAddress;

	@Column(name = "pin")
	private Integer pin;

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

}
