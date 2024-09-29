# MYSTICAL Arena 
An open source project for beginners to get started with system design, java problem solving, junit, swagger and documentation. 
## Description
Mystical Arena is a Java console game where players engage in battles using health, strength, and attack attributes. Players roll dice to execute attacks and defend against opponents' attacks, with the objective of reducing their opponents' health to zero. This fast-paced and strategic game continues until one player's health is depleted.

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
    