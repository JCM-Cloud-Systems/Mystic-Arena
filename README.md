# MYSTIC Arena 
An open source project for beginners to get started with system design, java problem solving, junit, swagger and documentation.

## Problem Statement :

- Design a Mystic Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0.
- Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0
- Player with lower health attacks first at the start of a match.
- Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6
- Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2
- Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70
- Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3
- Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45
- And so on

## Project Description 
Project has been made to accommodate  requirements and scenarios mentioned in the above problem statement. Mystic Arena is a Java console game where players engage in battles using health, strength, and attack attributes. Players roll dice to execute attacks and defend against opponents' attacks, with the objective of reducing their opponents' health to zero. This fast-paced and strategic game continues until one player's health is depleted.

## Getting Started
A. Using Intellij IDEA(IDE)
1. Download and extract the zip file.
2. Open IDE and select File -> Open(Open the project directory MagicalArena)
3. Open and run the main class located at ` MagicalArena\src\main\java\com\swiggy\magicalarena\Main.java `

B. Using Command Line:
1. Download and extract the zip file.
2. Navigate to Project directory -> cd MagicalArena
3. Compile Java files: ` javac src/main/java/com/swiggy/magicalarena/*.java `
4. Run the Main class:` java -cp src\main\java com.jcm.mysticarena.Main `

## How to play
1. Enter the attributes for Player A when prompted (health, strength, attack).
2. Enter the attributes for Player B when prompted (health, strength, attack).
3. The game will simulate the battle between the two players, with Player having less health attacking first.
4. The attacker's attack value, multiplied by the attacking dice roll, determines the damage inflicted, while the defender's strength value, multiplied by the defending dice roll, determines the damage defended.
5. Any excess damage from the attacker reduces the defender's health.
6. The game continues with players exchanging attacker and defender roles until one player's health reaches zero, indicating the end of the match.
7. The game announces the winner based on which player's health reaches zero first.

## Project Structure:

- `pom.xml`: Maven configuration file.
- `src/main/java/com/swiggy/magicalarena`: Contains the source code of the Magical Arena project.
    - `Main.java`: Entry point of the program.
    - `Player.java`: Class representing a player in the game.
    - `MagicalArena.java`: Class representing the magical arena where the battles take place.
- `src/test/java/com/swiggy/magicalarena`: Contains unit test classes.
    - `PlayerTest.java`: Unit tests for the `Player` class.
    - `MagicalArenaTest.java`: Unit tests for the `MagicalArena` class.
    - `MainTest.java`: Unit tests for the `Main` class.
- `htmlReport/index.html` : Test Coverage Report




You can view the detailed test coverage report generated using JaCoCo in the HTML Report at following location:` \MagicalArena\htmlReport\index.html `
    