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

    public IceCream(int quantity) {
        this.quantity = quantity;
    }

    //    Customer print
    public void customerOrder(String flavor, double quantity){
        System.out.println("Next order: " + quantity +" scoops of " +flavor );
    };
//
    public double orderCost(double price, int quantity){
        double total = price * quantity;
        System.out.println("Charging $" + price + "for "+ quantity + "scoops. Customer Total= $" + total);
        return total;
    }

    public double convertQtyToOz(int quantity, String flavor){
        double ozCalc = quantity * 3.1;
        System.out.println("Customer ordered " + ozCalc + "oz of " + flavor);
        return ozCalc;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
