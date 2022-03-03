package com.DS.model;

public class UserDto {
	private String username;
	private String password;
	private String firstname;

	
	public UserDto() {

	}
	public UserDto(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		this.setFirstname(firstname);	
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}