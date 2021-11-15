package com.example.demo.service;



import com.example.demo.model.Packages;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityNotFoundException;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class PackagesServiceTest {
    @Autowired
    private PackagesService packagesService;

    @BeforeAll
    void setUp() {
        Packages packages = new Packages();
        packages.setPackageName("KRMS");
        packages.setPrice("10");
        packages.setDescription("be cool");
        packages.setDuration("2hr");

        packagesService.savePackages(packages);
    }

    @Test
    void testFindAll() {
        Assertions.assertFalse(packagesService.findAll().isEmpty());
    }

    @Test
    void testFindById() {
        Packages packages = packagesService.findById(1).orElseThrow(EntityNotFoundException::new);
        Assertions.assertEquals("KRMS", packages.getPackageName());
    }

    @Test
    void testUpdateEmployee() {
        Packages packages  = packagesService.findById(1).orElseThrow(EntityNotFoundException::new);
        packages.setDuration("5hr");
        Packages updatedPackages = packagesService.updatePackages(1, packages);
        Assertions.assertEquals("5hr", updatedPackages.getDuration());
    }

    @AfterAll
    void tearDown() {
        packagesService.deleteById(1);
    }

}
