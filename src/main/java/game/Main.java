package game;
import equipment.weapons;
import equipment.armors;
import character.character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create scanner
        Scanner scanner = new Scanner (System.in);

        //Create objects
        character myCharacter = new character("", 1, 1, 1, 1, 1, 1, 1);

        //Declare variables
        String characterName;
        String action;

        //First Message the player gets
        System.out.print("Welcome to the game. Please type the name of your character: ");
        while (true) {
            characterName = scanner.next();
            if (characterName.matches("[a-zA-Z]+")){
                myCharacter.setName(characterName);
                break;
            } else {
                System.out.print("Please place a valid character name (text only): ");
            }
        }

        System.out.println("At any point, if you want to check the commands, type /commands.");

        while (true) {
            action = scanner.next();
            if (action.equalsIgnoreCase("/commands")) {
                System.out.printf("LIST OF COMMANDS: \n status - Shows character's status \n");
            } else if (action.equalsIgnoreCase("status")){
                myCharacter.showStatus();
            } else{
                System.out.println("Command not recognized. Type /commands to check all available commands");
            }
        }
    }
}