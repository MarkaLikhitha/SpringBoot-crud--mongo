package com.example.mongo.api.resource;

import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.api.model.Employee;
import com.example.mongo.api.service.EmployeeService;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")
	public Employee saveEmployee(@RequestBody Employee request) throws URISyntaxException {

		return employeeService.saveEmployee(request);
		/*
		 * return "Added Employee : " + employee.getId();
		 */ }

	@GetMapping("/findAllEmployees")
	public List<Employee> getEmployees() {
		return employeeService.findAll();

	}

	@GetMapping("/findAllEmployees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return employeeService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deteleBook(@PathVariable int id) {
		employeeService.deleteById(id);
		return "Employee deleted successfully : " + id;
	}

	@PutMapping("/update/{id}")
	public void updateEmp(@RequestBody Employee emp, @PathVariable int id) {
		employeeService.updateEmp(id, emp);
	}
}
