package com.jcm.mysticarena;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;
public class PlayerTest {


    private Player playerA;
    private Player playerB;

    @BeforeEach
    public void setup() {
        playerA = new Player(10, 5, 3, "Player A");
        playerB = new Player(7, 7, 4, "Player B");
    }

    @Test
    public void testPlayerConstructor() {
        assertEquals(10, playerA.getHealth());
        assertEquals("Player A", playerA.getPlayerName());
        System.out.println(playerA.getHealth());
        assertEquals(7, playerB.getHealth());
        assertEquals("Player B", playerB.getPlayerName());
    }

    //Test method to ensure isAlive() method of Player class
    //To check it responds correctly when health is normal and after it receives damage
    @Test
    public void testIsAlive() {
        assertTrue(playerA.isAlive());
        assertTrue(playerB.isAlive());
        // System.out.println("Player A Health Before Damage: "+playerA.getHealth());
        // System.out.println("Player B Health Before Damage: "+playerB.getHealth());
        playerA.receiveDamage(100);
        playerB.receiveDamage(playerB.getHealth());
//        System.out.println("Player A Health After Damage: "+playerA.getHealth());
//        System.out.println("Player B Health After Damage: "+playerB.getHealth());
        assertFalse(playerA.isAlive());
        assertFalse(playerB.isAlive());
    }


    @Test
    public void testReceiveDamage() {
        playerA.receiveDamage(3);
        assertEquals(7, playerA.getHealth());
        playerB.receiveDamage(8);
        assertEquals(0, playerB.getHealth()); // Health should not go below 0
        playerB.receiveDamage(8);
        assertTrue(playerB.getHealth() >= 0, "Player B's health should be greater than or equal to 0");
    }

    @Test
    public void testRollDice() {
        int diceValue = playerA.rollDice();
        assertTrue(diceValue >= 1 && diceValue <= 6); // Dice value should be between 1 and 6
    }

    @Test
    public void testCalculateAttackDamage() {
        // Mocking rollDice method to return a fixed value for test predictability
        int attackDamage = playerA.calculateAttackDamage();
        assertTrue(attackDamage >= playerA.getAttack() * 1 && attackDamage <= playerA.getAttack() * 6);
    }

    @Test
    public void testCalculateDefendStrength() {
        int defendStrength = playerA.calculateDefendStrength();
        assertTrue(defendStrength >= playerA.getStrength() * 1 && defendStrength <= playerA.getStrength() * 6);
    }


}