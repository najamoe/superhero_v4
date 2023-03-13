package com.example.superhero_v4.repository;

import com.example.superhero_v4.dto.HeroCityDTO;
import com.example.superhero_v4.dto.PowerTypeDTO;
import com.example.superhero_v4.dto.NoPowersDTO;
import com.example.superhero_v4.model.Superheroes;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Repository("RepositoryDB")

public class RepositoryDB implements IRepository {

      //1. List of all heroes in the mysql database
    public List<Superheroes> getAllHeroes() {
        List<Superheroes> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superheroes","root","Qhr96wmr2k")){ //Din mySQL database, root som er mySQL username, kodeord til mySQL
            String SQL = "SELECT * FROM SUPERHERO;"; // SQL select all statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                superheroes.add(new Superheroes(rs.getString("HERONAME"),rs.getString("REALNAME"),rs.getDate("CREATIONYEAR")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Superhero by chosen name /{navn}
    public List<Superheroes> getHeroByName(String name) {
        ArrayList<Superheroes> allSuperheroes = (ArrayList<Superheroes>) this.getAllHeroes();
        ArrayList<Superheroes> superheroes = new ArrayList<>();
        for (Superheroes superhero: allSuperheroes) {
            if (superhero.getRealName().contains(name)) {
                superheroes.add(superhero);
            }
        }
        return superheroes;
    }

    //TODO sql statement for name search
    // 2. list of all heroes, with heroname, realname og number of powers

    public List<NoPowersDTO> getNoPowers() {
        List<NoPowersDTO> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")) {
            String SQL = "SELECT hero_name, real_name, no_powers FROM superherov4.superheroes";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()) {
                superheroes.add(new NoPowersDTO(rst.getString("hero_name"), rst.getString("real_name"), rst.getInt("no_powers")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //  /superpower/count/{navn}	: forespørgsel (2)

    public List<NoPowersDTO> getNoPowersName(String name) {
        List<NoPowersDTO> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")) {
            String SQL = "SELECT hero_name, real_name, no_powers FROM superherov4.superheroes WHERE hero_name=?";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()) {
                superheroes.add(new NoPowersDTO(rst.getString("hero_name"), rst.getString("real_name"), rst.getInt("no_powers")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //3. List of heroes with heroname, realname and type of superpower
    public List<PowerTypeDTO> getPowerType() {
        List<PowerTypeDTO> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")) {
            String SQL = "SELECT hero_name, real_name, superpower FROM superherov4.superheroes";
            Statement stamt = con.createStatement();
            ResultSet rste = stamt.executeQuery(SQL);
            while (rste.next()) {
                superheroes.add(new PowerTypeDTO(rste.getString("Hero_name"), rste.getString("real_name"), rste.getString("superpower")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //  /superpower/{navn}			: forespørgsel (3)
    public List<PowerTypeDTO> getPowerTypeName(String name) {
        List<PowerTypeDTO> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")) {
            String SQL = "SELECT hero_name, real_name, superpower FROM superherov4.superheroes WHERE hero_name = ?";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()) {
                superheroes.add(new PowerTypeDTO(rst.getString("hero_name"), rst.getString("real_name"), rst.getString("superpower")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //4. List of heroes with heroname and city
    public List<HeroCityDTO> getHeroCity() {
        List<HeroCityDTO> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")) {
            String SQL = "SELECT hero_name, city FROM superherov4.superheroes";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()) {
                superheroes.add(new HeroCityDTO(rst.getString("hero_name"), rst.getString("city")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //  /city/{navn}				: forespørgsel (4)
    public List<HeroCityDTO> getHeroCityName(String name) {
        List<HeroCityDTO> superheroes = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/superherov4", "root", "Barthur2254!")) {
            String SQL = "SELECT hero_name, city FROM superherov4.superheroes WHERE hero_name=?";
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(SQL);
            while (rst.next()) {
                superheroes.add(new HeroCityDTO(rst.getString("hero_name"), rst.getString("city")));
            }
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}






