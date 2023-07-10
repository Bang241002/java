package org.aptech.t2109e.springdemo.service.impl;

import org.aptech.t2109e.springdemo.module.Employee;
import org.aptech.t2109e.springdemo.service.EmployeeRepository;
import org.aptech.t2109e.springdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public abstract class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee){
        if(employee!=null){
            return  employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee){
        if(employee!=null){
            Employee employee1=employeeRepository.getById(id);
            if(employee!=null){
                employee1.setName(employee.getName());
                employee1.setWage(employee.getWage());

                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(long id){
        if(id>=1){
            Employee employee=employeeRepository.getById(id);
            if(employee!=null){
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(long id){
        return employeeRepository.getById(id);
    }
}
