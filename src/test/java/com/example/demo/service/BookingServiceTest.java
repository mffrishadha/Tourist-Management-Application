package com.example.demo.service;


import com.example.demo.model.Booking;

import com.example.demo.model.Customer;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;
import java.awt.print.Book;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookingServiceTest {

    @Autowired
    private BookingService bookingService;

    @BeforeAll
    void setUp() {
        Booking booking = new Booking();
        booking.setUserID("45");
        booking.setDate("02-01-2021");
        booking.setPackageID("10");
        booking.setPaymentReceipt_no("123400");


        bookingService.saveBooking(booking);
    }
    @Test
    void testFindAll() {
        Assertions.assertFalse(bookingService.findAll().isEmpty());
    }

    @Test
    void testFindById() {
        Booking booking = bookingService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("02-01-2021", booking.getDate());
    }
    @Test
    void testUpdateBooking() {
        Booking booking  = bookingService.findById(1).orElseThrow(EntityNotFoundException::new);
        booking.setDate("02-01-2021");
        Booking updatedBooking = bookingService.updatBooking(1, booking);
        Assertions.assertEquals("02-01-2021", updatedBooking.getDate());
    }

    @AfterAll
    void tearDown() {
        bookingService.deleteById(1);
    }

}
