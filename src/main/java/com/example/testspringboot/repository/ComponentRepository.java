package com.example.testspringboot.repository;


import com.example.testspringboot.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Integer> {

}
