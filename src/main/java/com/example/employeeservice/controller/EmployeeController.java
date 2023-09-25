package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepo repo;
    @GetMapping(path = "/getemployees")
    public List<Employee> getEmployees(){
        return repo.findAll();
    }

    @PostMapping(path = "/saveemployees")
    public List<Employee> saveEmployees(@RequestBody List<Employee> empList){
        return repo.saveAll(empList);
    }
}
