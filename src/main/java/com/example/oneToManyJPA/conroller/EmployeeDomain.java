package com.example.oneToManyJPA.conroller;

import com.example.oneToManyJPA.entity.Employee;

public class EmployeeDomain {

    private Employee employee;

    public EmployeeDomain() {
    }

    public EmployeeDomain(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
