package com.example.demo.controller;
import com.example.demo.model.Hotels;
import com.example.demo.service.HotelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HotelsController {

    @Autowired
    private HotelsService hotelsService;

    @GetMapping("/read-hotels")
    public String showReadHotelsPage(Model model) {
        model.addAttribute("hotels", hotelsService.findAll());
        return "readhotels";
    }

    @GetMapping("/create-hotels")
    public String showCreateHotelsPage(Model model) {
        model.addAttribute("command", new Hotels());
        return "createhotels";

    }

    @PostMapping("/create-hotels")
    public String createHotels(@ModelAttribute("hotels") Hotels hotels) {
        hotelsService.saveHotels(hotels);
        return "redirect:/read-hotels";
    }

}
