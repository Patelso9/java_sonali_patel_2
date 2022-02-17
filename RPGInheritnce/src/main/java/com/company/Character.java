package com.company;

public class Character {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

//    Constructor

    public Character() {
    }

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

//    Methods Character Performs

    public void run() {
        System.out.println("I AM RUNNING");
    }

    public void attack(Character enemy) {
        enemy.decreaseHealth(this.attackPower);
    }

    public void heal(int amount) {
        this.health += amount;
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void increaseStamina(int amount) {
        this.stamina += amount;
    }

    public void decreaseStamina(int amount) {
        this.stamina -= amount;
    }

//    Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
