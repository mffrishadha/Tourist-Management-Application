package com.example.demo.service;


import com.example.demo.model.Booking;

import com.example.demo.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired

    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}