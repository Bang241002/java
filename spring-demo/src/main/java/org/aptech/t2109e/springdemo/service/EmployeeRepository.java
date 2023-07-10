package org.aptech.t2109e.springdemo.service;

import org.aptech.t2109e.springdemo.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class EmployeeRepository implements JpaRepository<Employee, Long> {
}
