package com.example.demo.service;


import com.example.demo.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @BeforeAll
     void setUp() {
        Employee employee = new Employee();
        employee.setFirstname("Alex");
        employee.setLastname("Sue");
        employee.setEmployeeType("Guide");
        employee.setUsername("AlexSue");
        employee.setPassword("alex@123");
        employee.setLicenseNo("2345321");
        employee.setPhoneNumber("0774589685");

        employeeService.saveEmployee(employee);
    }

    @Test
    void testFindAll() {
        Assertions.assertFalse(employeeService.findAll().isEmpty());
    }

    @Test
    void testFindById() {
        Employee employee = employeeService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("Alex", employee.getFirstname());
    }


}
