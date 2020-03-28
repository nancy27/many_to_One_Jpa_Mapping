package com.example.oneToManyJPA.service;

import com.example.oneToManyJPA.AddressRepository;
import com.example.oneToManyJPA.EmployeeRepository;
import com.example.oneToManyJPA.entity.Address;
import com.example.oneToManyJPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;
    public Address createEmployee(Address address) {
        return addressRepository.save(address);
    }

    public Employee getEmployee(Integer employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    public List<Address> getAddress(Integer employeeId){
        return addressRepository.findAllByEmployeeId(employeeId);
    }
}
