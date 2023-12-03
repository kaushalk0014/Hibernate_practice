package com.kk.hibernate.domail;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Engineer_main")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Engineer implements Serializable {

	@Id
	@Column(name = "e_id", unique = true)
	private Integer eid;

	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "salary", length = 100)
	private String salary;

	 

	public Engineer(Integer eid, String name, String salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
