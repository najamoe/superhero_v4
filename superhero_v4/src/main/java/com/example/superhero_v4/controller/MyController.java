package com.example.superhero_v4.controller;

import com.example.superhero_v4.dto.HeroCityDTO;
import com.example.superhero_v4.dto.PowerTypeDTO;
import com.example.superhero_v4.dto.NoPowersDTO;
import com.example.superhero_v4.model.Superheroes;
import com.example.superhero_v4.repository.IRepository;
import com.example.superhero_v4.repository.RepositoryDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.RepositoryType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //used instead of controller, restcontroller returns JSON whereas controller returns HTML

public class MyController {

    @Autowired
    private IRepository repositoryDB;

    //Handle the root (/) endpoint and return a start page @return
    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome to superheroes";
    }

    //1. List of all heroes in the mysql database
    @GetMapping("/allheroes")
    public ResponseEntity<List<Superheroes>> getAllHeroes() {
        List<Superheroes> superheroesList = repositoryDB.getAllHeroes();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    // Superhero by chosen name /{navn}
    @GetMapping("/{name}")
    public ResponseEntity<List<Superheroes>> getSuperheroByName(@PathVariable String name) {
        List<Superheroes> superheroesList = repositoryDB.getHeroByName(name);
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    // 2. list of all heroes, with heroname, realname og number of powers
    @GetMapping("/superpower/count")
    public ResponseEntity<List<NoPowersDTO>> getHeroesPowerCount() {
        List<NoPowersDTO> superheroesList = repositoryDB.getNoPowers();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    //  /superpower/count/{navn}	: forespørgsel (2)
    @GetMapping("/superpower/count/{name}")
    public ResponseEntity<List<NoPowersDTO>> getNoPowersName(@PathVariable("name") String name) {
        List<NoPowersDTO> superheroesList = repositoryDB.getNoPowersName(name);
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    //3. List of heroes with heroname, realname and type of superpower
    @GetMapping("/superpower")
    public ResponseEntity<List<PowerTypeDTO>> getPowerType() {
        List<PowerTypeDTO> superheroesList = repositoryDB.getPowerType();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    //  /superpower/{navn}			: forespørgsel (3)
    @GetMapping("/superpower/{name}")
    public ResponseEntity<List<PowerTypeDTO>> getPowerTypeByName(@PathVariable String name) {
        List<PowerTypeDTO> superheroesList = repositoryDB.getPowerTypeName(name);
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    //4. List of heroes with heroname and city
    @GetMapping("/city")
    public ResponseEntity<List<HeroCityDTO>> getHeroCity() {
        List<HeroCityDTO> superheroesList = repositoryDB.getHeroCity();
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }

    //  /city/{navn}				: forespørgsel (4)
    @GetMapping("/city/{name}")
    public ResponseEntity<List<HeroCityDTO>> getHeroCityByName(String name) {
        List<HeroCityDTO> superheroesList = repositoryDB.getHeroCityName(name);
        return new ResponseEntity<>(superheroesList, HttpStatus.OK);
    }
}

// TODO all {names} not working
// TODO print all heroes printing null
