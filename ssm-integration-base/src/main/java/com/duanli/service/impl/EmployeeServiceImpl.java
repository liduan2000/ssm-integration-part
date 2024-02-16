package com.duanli.service.impl;

import com.duanli.mapper.EmployeeMapper;
import com.duanli.pojo.Employee;
import com.duanli.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = employeeMapper.queryList();
        return employeeList;
    }
}
