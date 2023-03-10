package com.example.superhero_v4.repository;

import com.example.superhero_v4.dto.HeroCityDTO;
import com.example.superhero_v4.dto.PowerTypeDTO;
import com.example.superhero_v4.dto.noPowersDTO;
import com.example.superhero_v4.model.Superheroes;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository("superheroeDB")
public class RepositoryDB implements IRepository{

    //1. List of all heroes in the mysql database
    public List<Superheroes> getAllHeroes(){
        List<Superheroes> superheroes = new ArrayList<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")){
            String SQL = "SELECT * FROM SUPERHEROES";
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()){
                superheroes.add(new Superheroes(rs.getString("hero_name"),rs.getString("real_name"),rs.getInt("creation_year")));
            }
            return superheroes;
        }
        catch (SQLException e) {

            throw new RuntimeException(e);
        }
    }
    // 2. list of all heroes, with heroname, realname og number of powers

    public static List<noPowersDTO> getNoPowers(){
        List<noPowersDTO> superheroes = new ArrayList<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")){
            String SQL = "SELECT hero_name, real_name, no_powers FROM superheroes";
            Statement stmt=con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()){
                superheroes.add(new noPowersDTO(rst.getString("hero_name"),rst.getString("real_name"),rst.getInt("no_powers")));
            }
            return superheroes;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //3. List of heroes with heroname, realname and type of superpower
    public static List<PowerTypeDTO> getPowerType(){
        List<PowerTypeDTO> superheroes = new ArrayList<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")){
            String SQL = "SELECT hero_name, real_name, superpower FROM superheroes";
            Statement stmt=con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()){
                superheroes.add(new PowerTypeDTO(rst.getString("hero_name"),rst.getString("real_name"),rst.getString("superpower")));
            }
            return superheroes;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //4. List of heroes with heroname and city
    public static List<HeroCityDTO> getHeroCity(){
        List<HeroCityDTO> superheroes = new ArrayList<>();
        try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")){
            String SQL = "SELECT hero_name, city FROM superheroes";
            Statement stmt=con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()){
                superheroes.add(new HeroCityDTO(rst.getString("hero_name"),rst.getString("city")));
            }
            return superheroes;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
