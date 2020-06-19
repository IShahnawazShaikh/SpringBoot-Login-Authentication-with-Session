package com.prolog.SpringBootWebApplication.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LOGINTEST")
public class NewUser {
	@GeneratedValue
	@Column(name="UserId")
    private long id;
	@Id
   private String username;
@Column(name="password")
 private String password;
private String email;
private String phone;
  public NewUser() {}
  
public NewUser(long id, String username, String password, String email, String phone) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.email = email;
	this.phone = phone;
}

public long getId() {
	return id;
}
public void setId(long id) {
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

}
