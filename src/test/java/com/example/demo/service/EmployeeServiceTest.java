package com.example.demo.service;


import com.example.demo.model.Employee;
import org.junit.jupiter.api.*;
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
        employee.setUserType("Guide");
        employee.setUsername("AlexSue");
        employee.setPassword("alex@123");
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

    @Test
    void testUpdateEmployee() {
        Employee employee = employeeService.findById(1).orElseThrow(EntityNotFoundException::new);
        employee.setPhoneNumber("0778965478");
        Employee updatedEmployee = employeeService.updateEmployee(1, employee);
        Assertions.assertEquals("0778965478", updatedEmployee.getPhoneNumber());
    }

    @AfterAll
    void tearDown() {
        employeeService.deleteById(1);
    }

}
