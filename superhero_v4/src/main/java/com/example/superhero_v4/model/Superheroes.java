package com.example.superhero_v4.model;
import jakarta.persistence.*;
import java.sql.Date;

@Entity //Tells mysql this class will be a table
public class Superheroes {
@Id //Tells mysql that this attribute will be the primary key to the entity (table)
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int heroID;
    @Column
    private String heroName;
    @Column
    private String realName;
    @Column
    private int creationYear;
    @Column
    private String superpower;
    @Column
    private String city;
    @Column
    private int noPowers;

    public Superheroes(String hero_name, String real_name, int creation_year) {
    }

    @Override
    public String toString() {
        return "Superheroes{" +
                "heroID=" + heroID +
                ", heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", creationYear=" + creationYear +
                ", superpower=" + superpower +
                ", city='" + city + '\'' +
                ", noPowers=" + noPowers +
                '}';
    }

    public Superheroes(int heroID, String heroName, String realName, int creationYear, String superpower, String city, int noPowers) {
        this.heroID = heroID;
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
        this.superpower = superpower;
        this.city = city;
        this.noPowers = noPowers;
    }

    public Superheroes() {

    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
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

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNoPowers() {
        return noPowers;
    }

    public void setNoPowers(int noPowers) {
        this.noPowers = noPowers;
    }
}
