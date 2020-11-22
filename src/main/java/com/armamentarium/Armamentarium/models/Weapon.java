package com.armamentarium.Armamentarium.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Weapon {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "weapon")
    private String weapon;

    @Column(name = "grip")
    private String grip;

    @Column(name = "handedness")
    private String handedness;

    @Column(name = "is_working")
    private boolean is_working;

    @Column(name = "comment")
    private String comment;

    @Column(name = "is_borrowed")
    private boolean is_borrowed;

    @Column(name = "electric")
    private String electric;

    public Weapon(String weapon, String grip, String handedness, boolean is_working, String comment, boolean is_borrowed, String electric) {
        this.weapon = weapon;
        this.grip = grip;
        this.handedness = handedness;
        this.is_working = is_working;
        this.comment = comment;
        this.is_borrowed = is_borrowed;
        this.electric = electric;
    }


    public Weapon() {
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public boolean isIs_working() {
        return is_working;
    }

    public void setIs_working(boolean is_working) {
        this.is_working = is_working;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isIs_borrowed() {
        return is_borrowed;
    }

    public void setIs_borrowed(boolean is_borrowed) {
        this.is_borrowed = is_borrowed;
    }

    public String getElectric() {
        return electric;
    }

    public void setElectric(String electric) {
        this.electric = electric;
    }
}
