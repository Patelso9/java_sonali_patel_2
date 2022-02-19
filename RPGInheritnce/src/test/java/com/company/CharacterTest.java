package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class CharacterTest {

    Character character;

    @Before
    public void setUp() throws Exception {

        character = new Character("char1", 75, 100, 75, 10, 1);
    }

    @Test
    public void checkingGetter() {
        assertEquals(75, character.getStrength());
        assertEquals(100, character.getHealth());
        assertEquals(75, character.getStamina());
        assertEquals(10, character.getSpeed());
        assertEquals(1,character.getAttackPower());
    }

    @Test
    public void attackAnotherCharacter() {
        Character enemy = new Character("Enemy", 75,100,100,50,10);
        character.attack(enemy);
        assertEquals(99, enemy.getHealth());
    }

    @Test
    public void testHeal() {
        character.heal(20);
        assertEquals(120,character.getHealth());
    }

    @Test
    public void decreaseHealthTest() {
        character.decreaseHealth(25);
        assertEquals(75,character.getHealth());
    }

    @Test
    public void increaseStaminaTest() {
        character.increaseStamina(5);
        assertEquals(80, character.getStamina());
    }

    @Test
    public void decreaseStaminaTest() {
        character.decreaseStamina(10);
        assertEquals(65, character.getStamina());
    }


}

