package com.course.dto;

public class TodoDto {
	
	private String title;
	
	private String username;

	public TodoDto() {
	}
	
	public TodoDto(String title,String username) {
		super();
		this.username = username;
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
