package com.ericlam.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club { // container

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String familyname;
    private String givenname;
    private String sex;
    private int phone;
    private String sport;
    private String level;

    public Club() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getFamilyname() {
        return familyname;
    }

    public String getGivenname() {
        return givenname;
    }

    public String getSex() {
        return sex;
    }

    public int getPhone() {
        return phone;
    }

    public String getSport() {
        return sport;
    }

    public String getLevel() {
        return level;
    }
}
