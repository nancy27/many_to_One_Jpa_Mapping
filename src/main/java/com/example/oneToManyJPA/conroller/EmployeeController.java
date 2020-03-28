package com.example.oneToManyJPA.conroller;

import com.example.oneToManyJPA.entity.Address;
import com.example.oneToManyJPA.entity.Employee;
import com.example.oneToManyJPA.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method= RequestMethod.POST,value="/employee")
    public Address createEmployee(@RequestBody Address address){
      return employeeService.createEmployee(address);

    }

    @RequestMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @RequestMapping("/employeeaddress/{employeeId}")
    public List<Address> getAddress(@PathVariable Integer employeeId){
        return employeeService.getAddress(employeeId);
    }
}
