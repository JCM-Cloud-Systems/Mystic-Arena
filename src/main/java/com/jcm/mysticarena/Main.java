package com.jcm.mysticarena;

import java.util.*;
public class Main {

    // Method to create a player based on user input
    public static Player createPlayer(Scanner scanner, String playerName){
        int health = 0, strength = 0, attack = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter " + playerName + "'s attribute");
                // Prompt user for player attributes
                System.out.print("Health: ");
                health = scanner.nextInt();

                 System.out.print("Strength: ");
                  strength= scanner.nextInt();

                 System.out.print("Attack: ");
                 attack = scanner.nextInt();

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.nextLine(); // clear the invalid input
            }
        }


        // Create and return a new Player object with the provided attributes
                return new Player(health,strength,attack,playerName);

    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter attributes for Players
        Player playerA = createPlayer(scanner, "Player A");
        Player playerB = createPlayer(scanner, "Player B");

        // Create a Match object with the two players and start method is called from match's class
        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.start();

        scanner.close();

    }
}