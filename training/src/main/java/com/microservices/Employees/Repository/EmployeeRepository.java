package com.microservices.Employees.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.Employees.entity.Employee;


@Repository
public interface  EmployeeRepository extends  JpaRepository<Employee,Integer>{

	
}
