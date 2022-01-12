package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Director")
public class Director {
@Id
private int directorId;
private String firstName;


private String lastName;
private String address;
private int contactNumber;
private String Email;


public int getDirectorId() {
return directorId;
}

public void setDirectorId(int directorId) {
	this.directorId = directorId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getAdress() {
	return address;
}

public void setAdress(String address) {
	this.address = address;
}


public int getContactNumber() {
	return contactNumber;
}


public void setContactNumber(int contactNumber) {
	this.contactNumber = contactNumber;
}


public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}

}