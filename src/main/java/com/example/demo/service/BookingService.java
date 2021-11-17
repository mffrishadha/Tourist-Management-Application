package com.example.demo.service;


import com.example.demo.model.Booking;


import com.example.demo.model.Customer;
import com.example.demo.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired

    private BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> findById(int id) {
        return bookingRepository.findById(id);
    }

    public Booking updatBooking(int id, Booking booking) {
        Booking updateBooking = bookingRepository.findById(id).orElse(null);
        updateBooking.setDate(booking.getDate());
        updateBooking.setPaymentReceipt_no(booking.getPaymentReceipt_no());

        return bookingRepository.save(updateBooking);
    }
    public void deleteById(int id) {
        bookingRepository.deleteById(id);
    }




}
