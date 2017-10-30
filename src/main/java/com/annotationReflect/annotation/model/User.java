package com.annotationReflect.annotation.model;

import com.annotationReflect.annotation.annot.Visible;

public class User {

	private int id;
	private String name;
	private String login;
	private String password;
	private boolean active;
	
	public User() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Visible
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Visible
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
