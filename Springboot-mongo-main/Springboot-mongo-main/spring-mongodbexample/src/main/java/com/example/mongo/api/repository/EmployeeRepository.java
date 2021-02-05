package com.example.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.api.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
