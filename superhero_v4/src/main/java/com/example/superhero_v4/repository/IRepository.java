package com.example.superhero_v4.repository;

import com.example.superhero_v4.dto.HeroCityDTO;
import com.example.superhero_v4.dto.NoPowersDTO;
import com.example.superhero_v4.dto.PowerTypeDTO;
import com.example.superhero_v4.model.Superheroes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepository {
    //1. List of all heroes in the mysql database
    List<Superheroes> getAllHeroes();
    List<Superheroes> getHeroByName(String name);

    // 2. list of all heroes, with heroname, realname og number of powers
    List <NoPowersDTO> getNoPowers();
    List <NoPowersDTO> getNoPowersName(String name);

    //3. List of heroes with heroname, realname and type of superpower
    List<PowerTypeDTO> getPowerType();
    List<PowerTypeDTO> getPowerTypeName(String name);
    //4. List of heroes with heroname and city

    List<HeroCityDTO> getHeroCity();
    List<HeroCityDTO> getHeroCityName(String name);


}
