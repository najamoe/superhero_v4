package com.example.superhero_v4.repository;

import com.example.superhero_v4.model.Superheroes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<Superheroes, Long> {
}
