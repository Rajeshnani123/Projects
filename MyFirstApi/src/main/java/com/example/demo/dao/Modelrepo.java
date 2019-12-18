package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Model;

public interface Modelrepo extends JpaRepository<Model,Integer> {

}
