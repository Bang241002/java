package org.aptech.t2109e.springdemo.controller;

import org.aptech.t2109e.springdemo.module.Employee;
import org.aptech.t2109e.springdemo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public abstract class EmployeeController implements IEmployeeService {


    private IEmployeeService iEmployeeService ;
    @Autowired
    @GetMapping("/")
    public String test(){
        return "timoday";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return IEmployeeService.addEmployee(employee);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id, @RequestBody Employee employee){
        return IEmployeeService.updateEmployee(id, employee);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") long id){
        return IEmployeeService.deleteEmployee(id);
    }

    @GetMapping("/list")
    public List<Employee> getALLEmployee(){
        return IEmployeeService.getAllEmployee();
    };
}
