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
public class MainController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/login-user")
    public String loginUser(Customer customer)
    {
        final  String username =customer.getUsername();
        final String password =customer.getPassword();



        if(username.equals("admin") && password.equals("admin"))
        {
            return "indexHome";
        }
        else
        {
            Customer customer1 = customerService.findByUsernameAndPassword(username,password);

            if (customer1==null)
            {
                return "redirect:/";
            }
            return "index";
        }

    }

    @PostMapping("/signUp-user")
    public String signUser()
    {
        return "SignUp";
    }


    @GetMapping("/logOut-customer")
    public String logOutUser()
    {
        return "index";
    }

    @GetMapping("/home")
    public String indexHome()
    {
        return "indexHome";
    }

    @GetMapping("/tours")
    public String ourtour()
    {
        return "tours";
    }

    @GetMapping("/bookings")
    public String bookings()
    {
        return "Bookings";
    }

    @GetMapping("/contact")
    public String contactus()
    {
        return "contact";
    }
}