package com.example.mongo.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongo.api.model.Employee;
import com.example.mongo.api.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;

	public Employee saveEmployee(Employee request) {
		request.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));

		return repository.save(request);
	}

	public void deleteById(int id) {
		repository.deleteById(id);

	}

	public Optional<Employee> findById(int id) {
		return repository.findById(id);
	}

	public List<Employee> findAll() {
		return repository.findAll();
	}

	public Employee save(Employee emp) {
		return repository.save(emp);
	}

	public Employee updateEmp(int id, Employee emp) {
		Optional<Employee> empl = repository.findById(id);
		Employee emp1 = empl.get();
		if (empl.isPresent()) {

			repository.save(emp);
		}
		return emp1;
	}
}
