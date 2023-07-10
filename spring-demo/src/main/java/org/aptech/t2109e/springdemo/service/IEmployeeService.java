package org.aptech.t2109e.springdemo.service;

import org.aptech.t2109e.springdemo.module.Employee;

import java.util.List;

public interface IEmployeeService
{

    static Employee addEmployee(Employee employee){
        return null;
    };

    static Employee updateEmployee(long id, Employee employee) {
        return null;
    };

    static boolean deleteEmployee(long id) {
        return false;
    }

    static List<Employee> getAllEmployee() {
        return null;
    };

    Employee getOneEmployee(long id);

}
