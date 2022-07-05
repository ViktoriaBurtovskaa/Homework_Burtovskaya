package com.telran.alex.game.hero;

import com.telran.alex.game.constant.Constant;

public class Ork {
    private long id;

    private String name;
    private boolean gender;
    private int level;

    private int energy;

    private int power;
    private int repulsion;


    public Ork(int id) {
        this.id = id;
        this.power = Constant.ORK_POWER;
        this.repulsion = Constant.ORK_REPULSION;
        this.energy = Constant.ORK_ENERGY;
    }

    public Ork() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getFortune() {
        return energy;
    }

    public void setFortune(int fortune) {
        this.energy = fortune;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCharisma() {
        return repulsion;
    }

    public void setCharisma(int charisma) {
        this.repulsion = charisma;
    }
}


