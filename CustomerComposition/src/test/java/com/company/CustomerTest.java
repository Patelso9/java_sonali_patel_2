package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.*;

public class CustomerTest {

    Address bobShipping;
    Address nelsonShipping;
    Address nelsonBilling;

    Customer bobSmith;
    Customer nelsonJohn;


    @Before
    public void setUp() throws Exception {

        nelsonShipping = new Address("3 W 29th st", " ", "Aurora", "Illinois", "62937");
        nelsonBilling = new Address("3 W Corning St", "Box 654", "Aurora", "Illinois", "67888");
        bobShipping = new Address("8 W Pacific Blvd", "Unit 6", "Fort Lauderdale", "Florida", "30009");

        bobSmith = new Customer("Bob", "Smith", "bob@mail.com", "343-444-4567", bobShipping, bobShipping, true);
        nelsonJohn= new Customer("Nelson", "John", "nelson@mail.com", "666-293-3939", nelsonShipping, nelsonBilling, false);

    }


    @Test
    public void getAddressTest() {
        assertEquals(bobSmith.getBillingAddress(), bobShipping);

    }

    @Test
    public void testSetBillingAddress() {

        bobSmith.setBillingAddress(nelsonShipping);
        assertEquals(bobSmith.getBillingAddress(), nelsonShipping);
    }

    @Test
    public void testSetShippingAddress() {
        nelsonJohn.setShippingAddress(nelsonBilling);
        assertEquals(nelsonJohn.getShippingAddress(), nelsonBilling);

    }


    //    @Test
//    public void shouldFail() {
//
//        assertEquals(bobSmith.getBillingAddress(), jessShipping);
//    }
}