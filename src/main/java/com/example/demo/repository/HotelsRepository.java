package com.example.demo.repository;

import com.example.demo.model.Hotels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsRepository extends JpaRepository<Hotels, Integer> {
}
