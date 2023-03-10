package com.example.superhero_v4.controller;

import com.example.superhero_v4.dto.HeroCityDTO;
import com.example.superhero_v4.dto.PowerTypeDTO;
import com.example.superhero_v4.dto.noPowersDTO;
import com.example.superhero_v4.model.Superheroes;
import com.example.superhero_v4.repository.RepositoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Handle the root (/) endpoint and return a start page @return
@RestController //used instead of controller, restcontroller returns JSON whereas controller returns HTML

// @RequestMapping("/heroes"/ Not using requestmapping for class, if I do, the paths will be absolute, i.e localhost:8080/heroes/nextmapvalue
public class MyController {

    @Autowired
    private RepositoryDB repositoryDB;

    @GetMapping(value="/")
    public String getPage(){
        return "Welcome to superheroes";
    }


    //1. List of all heroes in the mysql database
    @GetMapping("/allheroes")
    public ResponseEntity<List<Superheroes>> getAllHeroes(){
        List <Superheroes> superheroesList = repositoryDB.getAllHeroes();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }
    // 2. list of all heroes, with heroname, realname og number of powers
    @GetMapping("/superpower/count")
    public ResponseEntity<List<noPowersDTO>> getHeroesPowerCount(){
        List <noPowersDTO> superheroesList = RepositoryDB.getNoPowers();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }
    //3. List of heroes with heroname, realname and type of superpower
    @GetMapping("/superpower")
    public ResponseEntity<List<PowerTypeDTO>> getPowerType(){
        List <PowerTypeDTO> superheroesList = RepositoryDB.getPowerType();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    //4. List of heroes with heroname and city
    @GetMapping("/city")
    public ResponseEntity<List<HeroCityDTO>> getHeroCity(){
        List <HeroCityDTO> superheroesList = RepositoryDB.getHeroCity();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

}
