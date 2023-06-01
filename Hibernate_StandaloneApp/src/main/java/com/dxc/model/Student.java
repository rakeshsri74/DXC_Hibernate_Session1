package com.dxc.model;
/*
 * In Database
 * create database dxc;
 * use dxc;
 * create table STUDENT(id int primary key auto_increment,FIRST_NAME varchar(50) not null,LAST_NAME varchar(50) not null,SECTION varchar(10) not null);
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="FIRST_NAME",nullable=false)
	private String firstName;
	
	@Column(name="LAST_NAME",nullable=false)
	private String lastName;
	
	@Column(name="SECTION",nullable=false)
	private String section;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
				+ "]";
	}
	
	
}
