package com.example.superhero_v4.dto;

public class HeroCityDTO {

    private String heroName;
    private String city;

    public HeroCityDTO(String heroName, String city) {
        this.heroName = heroName;
        this.city = city;

    }public String getHeroName() {
        return heroName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
