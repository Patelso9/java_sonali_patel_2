package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IceCreamTest {

    String [] chocoIng = new String[] {"Milk", "Sugar", "Chocolate"};


    IceCream chocoIce = new IceCream("Chocolate", 6.5, 4.1, 78, chocoIng, 2);
    IceCream javaIce = new IceCream("Java Chip", 8, 6, 134, chocoIng, 9);



    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void FactoryCostTest() {

        assertEquals(8.2, chocoIce.produceAFlavor(chocoIce.getProductionCost(), chocoIce.getQuantity(),chocoIce.getFlavor()),.01);
        assertEquals(54, javaIce.produceAFlavor(javaIce.getProductionCost(), javaIce.getQuantity(),javaIce.getFlavor()),.01);

    }

    @Test
    public void incomeOffSales() {

        assertEquals(4.8,chocoIce.incomeOffSales(chocoIce.getSalePrice(),chocoIce.getProductionCost(),chocoIce.getQuantity(),chocoIce.getFlavor()),.01);
        assertEquals(18,javaIce.incomeOffSales(javaIce.getSalePrice(),javaIce.getProductionCost(),javaIce.getQuantity(),javaIce.getFlavor()),.01);

    }

    @Test
    public void convertProductionFromMinToHours() {

        assertEquals(18, chocoIce.productionTimeHours(chocoIce.getProductionTime(),chocoIce.getFlavor()));
        assertEquals(14, javaIce.productionTimeHours(javaIce.getProductionTime(),javaIce.getFlavor()));

    }
}
