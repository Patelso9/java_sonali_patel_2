package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream chocoIce = new IceCream("Chocolate", 6.5,2);
    IceCream mintIce = new IceCream("Mint Chip", 10.5,4);
    IceCream javaIce = new IceCream("Java Chip", 8.9,1);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void costForScoop() {

        assertEquals(13, chocoIce.orderCost(chocoIce.getPrice(), chocoIce.getQuantity()), .01);
        assertEquals(42.0, mintIce.orderCost(mintIce.getPrice(), mintIce.getQuantity()), .01);
        assertEquals(8.9, javaIce.orderCost(javaIce.getPrice(), javaIce.getQuantity()), .01);
    }

    @Test
    public void ozConversionForOrder() {

        assertEquals(6.2, chocoIce.convertQtyToOz(chocoIce.getQuantity(), chocoIce.getFlavor()),.01);
        assertEquals(12.4, mintIce.convertQtyToOz(mintIce.getQuantity(), mintIce.getFlavor()),.01);
        assertEquals(3.1, javaIce.convertQtyToOz(javaIce.getQuantity(), javaIce.getFlavor()),.01);

    }
}