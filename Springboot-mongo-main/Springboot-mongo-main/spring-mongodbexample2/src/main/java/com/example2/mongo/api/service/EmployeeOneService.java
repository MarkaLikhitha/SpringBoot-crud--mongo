package com.example2.mongo.api.service;

import java.net.URI;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example2.mongo.api.commom.EmployeeRequest;
import com.example2.mongo.api.entity.EmployeeOne;
import com.example2.mongo.api.repository.EmployeeOneRepository;

@Service
public class EmployeeOneService {

	@Autowired
	private EmployeeOneRepository employeeOneRepository;

	public String addEmployeeSeat(@RequestParam int id, @RequestBody EmployeeRequest request)
			throws URISyntaxException {
		URI url = new URI("http://localhost:8080/employee/findAllEmployees");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Employee employee = request.getEmployee();
		EmployeeOne employeeOne = request.getEmployeeOne();

		RestTemplate restTemplate = new RestTemplate();

		@SuppressWarnings("unchecked")
		List<LinkedHashMap<String, Object>> responseEntiy = restTemplate.getForObject(url, List.class);
		for (LinkedHashMap<String, Object> Employee : responseEntiy) {
			Integer empId = (Integer) Employee.get("id");
			String empName = (String) Employee.get("employeeName");

			if (empId == id) {
				employeeOne.setEmployeeId(id);
				employeeOne.setEmployeeName(empName);
				employeeOneRepository.save(employeeOne);
				return "Added Successfully";
			}
		}
		return "Some Error Occured";

	}

	public List<EmployeeOne> findAll() {
		return employeeOneRepository.findAll();

	}

	public void deleteById(int id) {
		employeeOneRepository.deleteById(id);

	}

	public String updateEmp(int id, EmployeeOne emp) {
		Optional<EmployeeOne> empl = employeeOneRepository.findById(id);
		if (empl.isPresent()) {

			employeeOneRepository.save(emp);
			return "Updated Successfully";
		}
		return "Some Error Occured";
	}		
	}


