package com.company;

public class Farmer extends Character {

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
    }

    public void plant() {
        System.out.println("Planting");
    }

    public void harvest() {
        System.out.println("Harvesting");
    }

}
