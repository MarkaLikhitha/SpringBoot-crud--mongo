package com.example2.mongo.api.commom;
import com.example2.mongo.api.entity.EmployeeOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeRequest {

	@Override
	public String toString() {
		return "EmployeeRequest [employee=" + employee + ", employeeOne=" + employeeOne + "]";
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeOne getEmployeeOne() {
		return employeeOne;
	}
	public void setEmployeeOne(EmployeeOne employeeOne) {
		this.employeeOne = employeeOne;
	}
	private Employee employee;
	private EmployeeOne employeeOne;
}
