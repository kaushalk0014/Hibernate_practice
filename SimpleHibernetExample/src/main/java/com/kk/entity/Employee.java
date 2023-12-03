package com.kk.entity;

public class Employee {

	private Integer userId;
	private String usernae;
	private String jobType;
	
	public Employee() {
		System.out.println("================================:Employee:==============================");
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsernae() {
		return usernae;
	}
	public void setUsernae(String usernae) {
		this.usernae = usernae;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public Employee(Integer userId, String usernae, String jobType) {
		super();
		this.userId = userId;
		this.usernae = usernae;
		this.jobType = jobType;
	}
	
	
}
