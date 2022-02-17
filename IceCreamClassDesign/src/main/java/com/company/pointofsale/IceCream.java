package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

//    Provided
    public void refillQty(double amount){
        this.quantity += amount;
    }

    public void scoop(int scoops) {
        this.quantity -= scoops * 10;
        System.out.format("Thanks that will be %f dollars!", price * scoops);
    }

    public void sample() {
        this.quantity--;
    }


//    Customer print
//    public void customerOrder(String flavor, double quantity){
//        System.out.println("Next order: " + quantity +" scoops of " +flavor );
//    };
//
//    public double orderCost(double price, int quantity){
//        double total = price * quantity;
//        System.out.println("Charging $" + price + "for "+ quantity + "scoops. Customer Total= $" + total);
//        return total;
//    }




}
