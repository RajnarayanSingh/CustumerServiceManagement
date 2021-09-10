package com.cms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Table;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.stereotype.Indexed;

import com.sun.istack.NotNull;

@Entity

public class Custumers {
	
@Id
private int custumerId;
@NotNull
private String name;
@NotEmpty
@Column(unique=true)
@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
private String email;

@Column(unique=true)
//@Pattern(regexp = "(0/91)?[7-9][0-9]{9}")
@Size(min=10, max= 10)
private String mobileNumber;
  
private String address;
public Custumers() {
	super();
	// TODO Auto-generated constructor stub
}
public Custumers(int custumerId, String name, String email,  String mobileNumber, String address) {
	super();
	this.custumerId = custumerId;
	this.name = name;
	this.email = email;
	this.mobileNumber = mobileNumber;
	this.address = address;
}
public int getCustumerId() {
	return custumerId;
}
public void setCustumerId(int custumerId) {
	this.custumerId = custumerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
