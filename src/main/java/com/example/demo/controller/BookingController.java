package com.example.demo.controller;



import com.example.demo.model.Booking;

import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/create-booking")
    public String showCreateBookingPage(Model model) {
        model.addAttribute("command", new Booking());
        return "createbooking";
    }

    @PostMapping("/create-booking")
    public String createBooking(@ModelAttribute("booking") Booking booking) {
        bookingService.saveBooking(booking);
        return "redirect:/read-booking";
    }

}
