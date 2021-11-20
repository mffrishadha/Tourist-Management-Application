package com.example.demo.service;

import com.example.demo.model.Packages;
import com.example.demo.repository.PackagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackagesService
{

    @Autowired
    private PackagesRepository packagesRepository;

    public List<Packages> findAll() {
        return packagesRepository.findAll();
    }

    public Optional<Packages> findById(int id) {
        return packagesRepository.findById(id);
    }

    public Packages savePackages(Packages packages) { return packagesRepository.save(packages); }

    public Packages updatePackages(int id, Packages packages) {
        Packages updatedPackages = packagesRepository.findById(id).orElse(null);
        updatedPackages.setUserID(packages.getUserID());
        updatedPackages.setPackageName(packages.getPackageName());
        updatedPackages.setHotelID(packages.getHotelID());
        updatedPackages.setPrice(packages.getPrice());
        updatedPackages.setDescription(packages.getDescription());
        updatedPackages.setDuration(packages.getDuration());

        return packagesRepository.save(updatedPackages);
    }

    public void deleteById(int id) {
        packagesRepository.deleteById(id);
    }

}