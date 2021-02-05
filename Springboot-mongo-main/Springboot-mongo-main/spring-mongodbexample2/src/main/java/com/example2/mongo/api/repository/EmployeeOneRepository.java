package com.example2.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example2.mongo.api.entity.EmployeeOne;

public interface EmployeeOneRepository extends MongoRepository<EmployeeOne, Integer> {

}
