package com.example.demo.controller;



import com.example.demo.model.Booking;


import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping ("/read-booking")
    public String showReadContactPage(Model model) {
        model.addAttribute("booking", bookingService.findAll());
        return "readbooking";
    }

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

    @GetMapping("/update-booking/{id}")
    public String showUpdateBookingPage(@PathVariable int id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("command", bookingService.findById(id).orElse(null));
        return "updatebooking";
    }

    @PostMapping("/update-booking/{id}")
    public String updateBooking(@PathVariable int id, @ModelAttribute("booking") Booking booking) {
        bookingService.updatBooking(id, booking);
        return "redirect:/read-booking";
    }
    @GetMapping("/delete-booking/{id}")
    public String deleteBooking(@PathVariable int id) {
        bookingService.deleteById(id);
        return "redirect:/read-booking";
    }


}
