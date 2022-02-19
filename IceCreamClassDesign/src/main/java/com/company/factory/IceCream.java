package com.company.factory;


public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;
    private int quantity;


    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients, int quantity) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public double produceAFlavor(double productionCost, int quantity, String flavor){
        double factoryCost = productionCost * quantity;
        System.out.println(flavor + " flavor costs $" + factoryCost + " to produce " + quantity + "gallons using a production cost of $" + productionCost + " per gallon");
        return factoryCost;
    }

    public double incomeOffSales(double salePrice, double productionCost, int quantity, String flavor){
        double income = (salePrice - productionCost) * quantity;
        System.out.println(quantity+" scoops of "+flavor+" made the business $" + income);
        return income;
    }

    public int productionTimeHours(int productionTime, String flavor){
       int convertToHour = productionTime / 60;
       int remainingMin = productionTime - (60 *convertToHour);
        System.out.println(flavor + " takes " + convertToHour + "hr and " + remainingMin + "min to produce");
       return remainingMin;
    };


    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
