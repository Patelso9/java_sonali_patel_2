package com.company;

import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter converterSwitch = new ConverterSwitch();
        Converter converterIf = new ConverterIf();

        System.out.format("The 6th month is %s%n", converterIf.convertMonth(6));
        System.out.format("The 2nd day is %s%n", converterIf.convertDay(2));
        System.out.format("The 1st month is %s%n", converterSwitch.convertMonth(1));
        System.out.format("The 7th day is %s%n", converterSwitch.convertDay(7));

    }


}
