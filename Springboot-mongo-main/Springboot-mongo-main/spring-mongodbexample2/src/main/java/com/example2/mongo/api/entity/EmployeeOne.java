package com.example2.mongo.api.entity;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection= "EmployeeOne")
public class EmployeeOne {
	

public int getId() {
		return id;
	}
	


	public int getEmployeeId() {
	return employeeId;
}



public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}



	@Override
public String toString() {
	return "EmployeeOne [id=" + id + ", employeeName=" + employeeName + ", employeeSeat=" + employeeSeat  + ", employeeId=" + employeeId + "]";
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
	public String getEmployeeSeat() {
		return employeeSeat;
	}
	public void setEmployeeSeat(String employeeSeat) {
		this.employeeSeat = employeeSeat;
	}
@Id
	private int id;
	private String employeeName;
	private String employeeSeat;
	private int employeeId;
	

}
