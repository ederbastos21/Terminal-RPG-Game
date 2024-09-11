package game;
import equipment.weapons;
import equipment.armors;
import character.character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create scanner
        Scanner scanner = new Scanner (System.in);

        //Create object
        character myCharacter = new character("name", 1, 1, 1, 1, 1, 1, 1);

        //Declare variables
        String characterName;
        String action;

        //Obtain Character name
        System.out.print("What's the name of your character? ");
        characterName = scanner.next();
        System.out.print("Type status to check your character's status: ");
        action = scanner.next();

        if (action.equals("status")){
            myCharacter.showStatus();
        }
        System.out.println(myCharacter.dealDamage());
    }
}