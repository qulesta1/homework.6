package com.company;

public class GameEntity {

    private String name;
    private int hp;
    private int damage;
    private String ulta;

    public GameEntity(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getUlta() {
        return ulta;
    }

    public void setUlta(String ulta) {
        this.ulta = ulta;
    }
}
