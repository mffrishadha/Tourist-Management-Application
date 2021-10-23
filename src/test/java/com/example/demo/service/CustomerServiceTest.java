package com.example.demo.service;

import com.example.demo.model.Customer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_METHOD)

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



}
