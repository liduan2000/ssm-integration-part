package com.duanli.controller;

import com.duanli.pojo.Employee;
import com.duanli.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("find")
    public List<Employee> find() {
        List<Employee> employeeList = employeeService.findAll();
        return employeeList;
    }
}
