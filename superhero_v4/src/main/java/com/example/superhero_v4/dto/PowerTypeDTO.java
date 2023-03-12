package com.example.superhero_v4.dto;

public class PowerTypeDTO {

    private String realName;
    private String heroName;
    private String powerType;

    public PowerTypeDTO(String realName, String heroName, String powerType) {
        this.realName = realName;
        this.heroName = heroName;
        this.powerType = powerType;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }




}
