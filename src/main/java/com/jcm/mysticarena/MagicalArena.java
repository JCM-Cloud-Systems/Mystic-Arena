package com.jcm.mysticarena;

public class MagicalArena {
    private Player playerA;
    private Player playerB;

    //Constructor
    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
        Player attacker = (playerA.getHealth() <= playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;
        System.out.println("\n\nStarting the match between " + this.playerA.getPlayerName() + " - " + this.playerB.getPlayerName());
        System.out.println(attacker.getPlayerName() + " will start with attacking");
        int rounds = 0;
        while (playerA.isAlive() && playerB.isAlive()) {
            pause();
            System.out.println("\n\nRound : " + ++rounds);
            attack(attacker, defender);
            leader(); // display current leading player after every round

            // Swap attacker and defender for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
            winner(rounds); // Determine and print the winner of the magical arena
    }

    // Method to handle an attack between two players
    public void attack(Player attacker, Player defender) {
        System.out.println("Attacker: " + attacker.getPlayerName());
        int attackDamage = attacker.calculateAttackDamage();
        int defendStrength = defender.calculateDefendStrength();
        int damageTaken = Math.max(0, attackDamage - defendStrength);
        System.out.println(attacker.getPlayerName() + ": Damaging " + defender.getPlayerName() + " with:" + damageTaken);
        defender.receiveDamage(damageTaken); // Apply damage to the defending player
        System.out.println(defender.getPlayerName() + ": Remaining Health: " + defender.getHealth());
    }

    public void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Do nothing if unable to sleep
        }
    }

    public void leader(){
        Player leading = (playerA.getHealth() > playerB.getHealth()) ? playerA : playerB;
        System.out.println("Leading Player: " + leading.getPlayerName());
    }
    public void winner(int rounds){
        Player winner = playerA.isAlive() ? playerA : playerB;
        System.out.println("\n\n\nStatistics:");
        System.out.println("Winner: " + winner.getPlayerName() + "\nRounds Taken: " + rounds);
    }

    // Getter for playerA{
    public Player getPlayerA() {
        return playerA;
    }

    // Getter for playerB
    public Player getPlayerB() {
        return playerB;
    }
    }

