package com.example2.mongo.api.controller;


import java.net.URISyntaxException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.mongo.api.commom.EmployeeRequest;
import com.example2.mongo.api.entity.EmployeeOne;
import com.example2.mongo.api.service.EmployeeOneService;

@RestController
@RequestMapping("/EmployeeOne")
public class EmployeeOneController {
	
	@Autowired
	private EmployeeOneService employeeOneService;
	
	@PostMapping("/addEmployeeSeat/{id}")
	
	public String addEmployeeSeat(@PathVariable int id, @RequestBody EmployeeRequest request)throws URISyntaxException  {
		return employeeOneService.addEmployeeSeat(id, request);
		
	}
	
	@GetMapping("/findAllEmployees")
	public List<EmployeeOne> getEmployee(){
		return employeeOneService.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deteleBook(@PathVariable int id) {
		employeeOneService.deleteById(id);
		return "EmployeeSeat deleted successfully : " + id;
	}
	
	@PutMapping("/update/{id}")
	public String updateEmp(@RequestBody EmployeeOne emp, @PathVariable int id) {
		return employeeOneService.updateEmp(id, emp);
	}
}