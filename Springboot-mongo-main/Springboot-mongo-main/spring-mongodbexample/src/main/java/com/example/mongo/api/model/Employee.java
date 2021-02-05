package com.example.mongo.api.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection= "Employee")
public class Employee {
	
	  @Transient public static final String SEQUENCE_NAME = "users_sequence";
	 

@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeDesignation=" + employeeDesignation
				+ ", employeeAddress=" + employeeAddress + ", employeeCode=" + employeeCode + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
@Id
	private int id;
	private String employeeName;
	private String employeeDesignation;
	private String employeeAddress;
	private String employeeCode;

}
