package com.ust.EmployeesecurityJwt.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User 
{
	private int id;
	private String username;
	private String password;
	private String email;
	private String phno;
	public User(int id, String username, String password, String email, String phno) 
	{
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
}
	
	