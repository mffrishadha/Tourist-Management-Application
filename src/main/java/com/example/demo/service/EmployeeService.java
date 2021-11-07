package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(int id, Employee employee) {

        Employee updatedEmployee = employeeRepository.findById(id).orElse(null);
        updatedEmployee.setUsername(employee.getUsername());
        updatedEmployee.setPassword(employee.getPassword());
        updatedEmployee.setEmployeeType(employee.getEmployeeType());
        updatedEmployee.setFirstname(employee.getFirstname());
        updatedEmployee.setLastname(employee.getLastname());
        updatedEmployee.setLicenseNo(employee.getLicenseNo());
        updatedEmployee.setPhoneNumber(employee.getPhoneNumber());

        return employeeRepository.save(updatedEmployee);

    }
}
