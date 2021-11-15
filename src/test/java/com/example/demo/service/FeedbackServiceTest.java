package com.example.demo.service;



import com.example.demo.model.Feedback;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

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

    @Test
    void testFindAll() {
        Assertions.assertFalse(feedbackService.findAll().isEmpty());
    }

    @Test
    void testFindById() {
        Feedback feedback = feedbackService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("Good service !", feedback.getFeed_back());
    }



    @AfterAll
    void tearDown() {
        feedbackService.deleteById(1);
    }


}

