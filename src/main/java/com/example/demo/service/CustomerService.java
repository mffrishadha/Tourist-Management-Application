package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(int id, Customer customer) {
        Customer updatedCustomer = customerRepository.findById(id).orElse(null);
        updatedCustomer.setFirstname(customer.getFirstname());
        updatedCustomer.setLastname(customer.getLastname());
        updatedCustomer.setPhoneNo(customer.getPhoneNo());
        updatedCustomer.setEmail(customer.getEmail());
        updatedCustomer.setNic(customer.getNic());
        updatedCustomer.setPassportNo(customer.getPassportNo());


        return customerRepository.save(updatedCustomer);
    }

    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

}

