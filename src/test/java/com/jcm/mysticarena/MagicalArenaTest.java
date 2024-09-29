package com.jcm.mysticarena;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MagicalArenaTest {

    private Player playerA;
    private Player playerB;
    private MagicalArena arena;

    @BeforeEach
    public void setup() {
        playerA = new Player(10, 5, 3, "Player A");
        playerB = new Player(9, 4, 2, "Player B");
        arena = new MagicalArena(playerA, playerB);

    }


    @Test
    public void testConstructor() {
        assertEquals(playerA, arena.getPlayerA(), "Player A should be correctly initialized");
        assertEquals(playerB, arena.getPlayerB(), "Player B should be correctly initialized");
    }



    @Test
    public void testStart_PlayerAWins() {
        playerB.receiveDamage(100); // Player B should start with low health
        arena.start();
        assertFalse(playerB.isAlive());
    }

    @Test
    public void testStart_PlayerBWins() {
        playerA.receiveDamage(100); // Player A should start with low health
        arena.start();
        assertFalse(playerA.isAlive());
    }



    @Test
    public void testAttack() {
        Player attacker = playerA;
        Player defender = playerB;
        assertDoesNotThrow(() -> arena.attack(attacker,defender));
    }

//    @Test
//    public void testAttack_PlayerBWins() {
//        Player attacker = playerB;
//        Player defender = playerA;
//        arena.attack(attacker,defender);
//        assertFalse(defender.isAlive());
//    }

    @Test
    public void testPause() {
        // Just test that pause method does not throw exceptions
        assertDoesNotThrow(() -> arena.pause());
    }

    @Test
    public void testLeader(){
        assertDoesNotThrow(() -> arena.leader());
    }

    @Test
    public void testGetPlayerA() {
        assertEquals(playerA, arena.getPlayerA());
    }

    @Test
    public void testWinner() {
        assertDoesNotThrow(() -> arena.winner(4));
    }

    @Test
    public void testGetPlayerB() {
        assertEquals(playerB, arena.getPlayerB());
    }
}
