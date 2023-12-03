package com.kk.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book_Details")
public class BookDetails {
	
	
	@Id
	private Long id;
	private String name;
	private String authorName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public BookDetails() {
		// TODO Auto-generated constructor stub
	}
	public BookDetails(Long id, String name, String authorName) {
		super();
		this.id = id;
		this.name = name;
		this.authorName = authorName;
	}

	
}
