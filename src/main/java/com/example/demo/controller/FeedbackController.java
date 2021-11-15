package com.example.demo.controller;



import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class FeedbackController {
    @Autowired

    private FeedbackService feedbackService;


    @GetMapping("/create-feedback")
    public String showCreateFeedbackPage(Model model) {
        model.addAttribute("command", new Feedback());
        return "createfeedback";
    }

    @PostMapping("/create-feedback")
    public String createFeedback(@ModelAttribute("feedback") Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/read-feedback";
    }





}
