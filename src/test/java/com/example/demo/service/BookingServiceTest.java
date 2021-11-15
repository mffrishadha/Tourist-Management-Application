package com.example.demo.service;


import com.example.demo.model.Booking;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookingServiceTest {

    @Autowired
    private BookingService bookingService;

    @BeforeAll
    void setUp() {
        Booking booking = new Booking();
        booking.setDate("02-01-2021");


        bookingService.saveBooking(booking);
    }
}
