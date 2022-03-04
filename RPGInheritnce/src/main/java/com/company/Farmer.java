package com.company;

public class Farmer extends Character {

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
    }

    public void plow() {
        System.out.println("Plow all day");
    }

    public void harvest() {
        System.out.println("Harvesting Food");
    }

}
