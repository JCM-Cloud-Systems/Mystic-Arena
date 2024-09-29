package com.jcm.mysticarena;

import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private String playerName;
    private Random random;



    // Constructor to initialize a player with given attributes
    public Player(int health, int strength, int attack, String playerName) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.playerName = playerName;
        this.random = new Random();

    }

    // Method to get the player's current health
    public int getHealth() {
        return health;
    }

    // To get the name of the player
    public String getPlayerName() {
        return this.playerName;
    }

    public int getAttack() {
        return attack;
    }

    public int getStrength() {
        return strength;
    }

    // Method to check if the player is alive (health > 0)
    public boolean isAlive() {
        return health > 0;
    }

    // Method to apply damage to the player
    public void receiveDamage(int damage) {
        this.health -= damage; // Reduce player's health by the given amount of damage
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // Method to simulate rolling a six-sided die
    public int rollDice() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println(this.getPlayerName() + ": Rolling dice; Got dice value of " + diceValue);
        return diceValue; // Return a random integer between 1 and 6
    }

    // Method to calculate the damage inflicted by the player's attack
    public int calculateAttackDamage() {
        int diceValue = rollDice();
        int attackValue = attack *  diceValue;
        System.out.println(this.getPlayerName() + ": Attack Value: " + attackValue);
        return attackValue;
    }

    // Method to calculate the defense strength of the player
    public int calculateDefendStrength() {
        int diceValue = rollDice();
        int defendValue = strength + diceValue; // issue in defend value
        System.out.println(this.getPlayerName() + ": Defend Value: " + defendValue);
        return defendValue;
    }



    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}