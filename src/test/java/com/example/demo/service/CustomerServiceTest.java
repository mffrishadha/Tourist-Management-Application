package com.example.demo.service;

import com.example.demo.model.Customer;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @BeforeAll
    void setUp() {
        Customer customer = new Customer();
        customer.setFirstname("John");
        customer.setLastname("Doe");
        customer.setPhoneNo("0778957489");
        customer.setEmail("john123@gmail.com");
        customer.setNic("964578114V");
        customer.setPassportNo("123456");
        customerService.saveCustomer(customer);
    }

    @Test
    void testFindAll() {
        Assertions.assertFalse(customerService.findAll().isEmpty());
    }

    @Test
    void testFindById() {
        Customer customer = customerService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("John", customer.getFirstname());
    }

    @Test
    void testUpdateEmployee() {
        Customer customer  = customerService.findById(1).orElseThrow(EntityNotFoundException::new);
        customer.setPhoneNo("0778954123");
        Customer updatedPackages = customerService.updateCustomer(1, customer);
        Assertions.assertEquals("0778954123", updatedPackages.getPhoneNo());
    }

    @AfterAll
    void tearDown() {
        customerService.deleteById(1);
    }


}
