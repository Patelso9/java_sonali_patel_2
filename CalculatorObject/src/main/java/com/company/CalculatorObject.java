package com.company;

public class CalculatorObject {

//    Calculating using integers
    public int add(int a, int b){
        int c = a+b;
        System.out.println(a + "+" + b + "=" + c);
        return c;
    }
    public double add(double a, double b){
        double c = a+b;
        System.out.println(a + "+" + b + "=" + c);
        return c;
    }

    public int subtract(int a, int b){
        int c = a-b;
        System.out.println(a + "-" + b + "=" + c);
        return c;
    }
    public double subtract(double a, double b){
        double c = a-b;
        System.out.println(a + "-" + b + "=" + c);
        return c;
    }

    public int multiply(int a, int b){
        int c = a*b;
        System.out.println(a + "*" + b + "=" + c);
        return c;
    }
    public double multiply(double a, double b) {
        double c = a*b;
        System.out.println(a + "*" + b + "=" + c);
        return c;
    }

    public int divide(int a, int b){
        int c = a/b;
        System.out.println(a + "/" + b + "=" + c);
        return c;
    }
    public double divide(double a, double b) {
        double c = a / b;
        System.out.println(a + "/" + b + "=" + c);
        return c;
    }



}
