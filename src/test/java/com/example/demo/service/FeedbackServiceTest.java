package com.example.demo.service;


import com.example.demo.model.Feedback;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FeedbackServiceTest {

    @Autowired
    private FeedbackService feedbackService;

    @BeforeAll
    void setUp() {
        Feedback feedback = new Feedback();
        feedback.setFeed_back("Good service !");


        feedbackService.saveFeedback(feedback);
    }



}

