package com.ldz.ssm.service.impl;


import com.ldz.ssm.beans.Employee;
import com.ldz.ssm.mapper.EmployeeMapper;
import com.ldz.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Dazhou Li
 * @Description:
 * @CreateDate: 2019/6/14 0014 16:32
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    public List<Employee> getAllEmps() {
        return employeeMapper.getAllEmps();
    }
}
