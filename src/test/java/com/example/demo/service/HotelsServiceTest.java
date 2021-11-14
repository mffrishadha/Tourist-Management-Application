package com.example.demo.service;


import com.example.demo.model.Hotels;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class HotelsServiceTest {
    @Autowired
    private HotelsService hotelsService;

    @BeforeAll
    void setUp() {
        Hotels hotels = new Hotels();
        hotels.setName("KRMS");
        hotels.setLocation("Ratnapura");
        hotels.setPhoneNumber("0774776742");

        hotelsService.saveHotels(hotels);
    }

    @Test
    void testFindAll() {
        Assertions.assertFalse(hotelsService.findAll().isEmpty());
    }

    @Test
    void testFindById() {
        Hotels hotels = hotelsService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("KRMS", hotels.getName());
    }

    @AfterAll
    void tearDown() {
        hotelsService.deleteById(1);
    }

}
