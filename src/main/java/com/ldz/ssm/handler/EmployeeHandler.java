package com.ldz.ssm.handler;

import com.ldz.ssm.beans.Employee;
import com.ldz.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @Author: Dazhou Li
 * @Description:
 * @CreateDate: 2019/6/14 0014 16:27
 */
@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeService employeeService;

    //显示所有的员工信息
    @RequestMapping(value = "/emps", method = RequestMethod.GET)
    public String listAllEmps(Map<String, Object> map) {
        List<Employee> emps = employeeService.getAllEmps();
        map.put("emps", emps);
        return "list";
    }
}
