package com.example.demo.service;

import com.example.demo.model.Hotels;
import com.example.demo.repository.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelsService
{

    @Autowired
    private HotelsRepository hotelsRepository;

    public List<Hotels> findAll() {
        return hotelsRepository.findAll();
    }

    public Optional<Hotels> findById(int id) {
        return hotelsRepository.findById(id);
    }

    public Hotels saveHotels(Hotels hotels) { return hotelsRepository.save(hotels); }

}