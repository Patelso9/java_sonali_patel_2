package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {

    ConverterIf converterIf;

    @Before
    public void setUp() throws Exception {
        converterIf = new ConverterIf();
    }

    @Test
    public void numberConvertsToDay() {
        assertEquals("Tuesday", converterIf.convertDay(2));
        assertEquals("Saturday", converterIf.convertDay(6));
        assertEquals("Sunday", converterIf.convertDay(7));
        assertEquals("Invalid input", converterIf.convertDay(20));
    }

    @Test
    public void numberConvertsToMonth() {
        assertEquals("February", converterIf.convertMonth(2));
        assertEquals("December", converterIf.convertMonth(12));
        assertEquals("October", converterIf.convertMonth(10));
        assertEquals("Invalid input", converterIf.convertMonth(24));
    }

}