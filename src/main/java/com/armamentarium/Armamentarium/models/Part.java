package com.armamentarium.Armamentarium.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Part {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "amount_working")
    private Integer amount_working;

    @Column(name = "comment")
    private String comment;

//  What weapons is it connected to?
    @Column(name = "weapons")
    private String weapons;


    public Part(Integer id, String name, Integer amount, Integer amount_working, String comment, String weapons) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.amount_working = amount_working;
        this.comment = comment;
        this.weapons = weapons;
    }

    public Part() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount_working() {
        return amount_working;
    }

    public void setAmount_working(Integer amount_working) {
        this.amount_working = amount_working;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }
}
