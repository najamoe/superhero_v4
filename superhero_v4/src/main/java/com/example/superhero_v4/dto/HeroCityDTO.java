package com.example.superhero_v4.dto;

import java.util.List;

public class HeroCityDTO {

    private String heroName;
    private String city;

    private List<String> heroCityList;

    public HeroCityDTO(String heroName, String city) {
        this.heroName = heroName;
        this.city = city;

    }public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }






}
