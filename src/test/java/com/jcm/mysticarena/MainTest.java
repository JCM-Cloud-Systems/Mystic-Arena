package com.jcm.mysticarena;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCreatePlayer_PlayerA() {
        String input = "10\n5\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner sc= new Scanner(in);
        Player player = Main.createPlayer(sc, "Player A");

        assertEquals(10, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(3, player.getAttack());
        assertEquals("Player A", player.getPlayerName());
    }

    @Test
    public void testCreatePlayer_PlayerB() {
        String input = "9\n5\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner sc= new Scanner(in);
        Player player = Main.createPlayer(sc, "Player B");

        assertEquals(9, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(4, player.getAttack());
        assertEquals("Player B", player.getPlayerName());
    }

    @Test
    public void testMain() {
        String input = "0\n0\n0\n0\n0\n0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertDoesNotThrow(() -> Main.main(new String[]{}));

    }
}
