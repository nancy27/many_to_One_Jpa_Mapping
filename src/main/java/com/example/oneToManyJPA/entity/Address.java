package com.example.oneToManyJPA.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity(name="address")
public class Address {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="address_id")
  private Integer addressId;
@Column(name="street_name")
  private String streetName;
@Column(name="employee_id",insertable = false,updatable = false)
private Integer employeeId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="employee_id", referencedColumnName = "employee_id")
private Employee employee;

    public Address() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
