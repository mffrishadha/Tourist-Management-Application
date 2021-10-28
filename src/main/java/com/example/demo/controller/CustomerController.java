package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/read-customer")
    public String showReadCustomerPage(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "readcustomer";
    }

    @GetMapping("/create-customer")
    public String showCreateCustomerPage(Model model) {
        model.addAttribute("command", new Customer());
        return "createcustomer";
    }

    @PostMapping("/create-customer")
    public String createCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/read-customer";
    }

    @GetMapping("/update-customer/{id}")
    public String showUpdateCustomerPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", customerService.findById(id).orElse(null));
        return "updatecustomer";
    }

    @PostMapping("/update-customer/{id}")
    public String updateCustomer(@PathVariable int id, @ModelAttribute("customer") Customer customer) {
        customerService.updateCustomer(id, customer);
        return "redirect:/read-customer";
    }



}
