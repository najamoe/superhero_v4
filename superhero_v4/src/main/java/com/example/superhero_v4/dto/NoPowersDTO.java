package com.example.superhero_v4.dto;
public class NoPowersDTO {

    private String heroName;
    private String realName;
    private int noPowers;

    public NoPowersDTO(String heroName, String realName, int noPowers) {
        this.heroName = heroName;
        this.realName = realName;
        this.noPowers = noPowers;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getNoPowers() {
        return noPowers;
    }

    public void setNoPowers(int noPowers) {
        this.noPowers = noPowers;
    }
}

//2.	En superhelt med et bestemt heroName eller en           liste med alle superhelte, der indeholder:
//      heroName, realName og antallet af superkræfter              (Superpower)


