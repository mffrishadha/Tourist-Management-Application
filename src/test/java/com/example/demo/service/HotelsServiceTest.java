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
        hotels.setName("Hilton");
        hotels.setLocation("Colombo");
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
        Assertions.assertEquals("Hilton", hotels.getName());
    }

    @Test
    void testUpdateEmployee() {
        Hotels hotels = hotelsService.findById(1).orElseThrow(EntityNotFoundException::new);
        hotels.setPhoneNumber("0778456478");
        Hotels updatedEmployee = hotelsService.updateHotels(1, hotels);
        Assertions.assertEquals("0778456478", updatedEmployee.getPhoneNumber());
    }

    @AfterAll
    void tearDown() {
        hotelsService.deleteById(1);
    }

}
