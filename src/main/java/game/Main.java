package game;
import equipment.weapons;
import equipment.armors;
import character.inventory;
import character.status;
import character.character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create scanner
        Scanner scanner = new Scanner (System.in);

        //Create object
        inventory myInventory = new inventory ();

        //Declare variables
        String characterName;
        String action;

        //Obtain Character name
        System.out.println("What's the name of your character? ");
        characterName = scanner.next();
        System.out.println("Your character's name is: "+ characterName);
        System.out.println("Type status to check your character's status");
        action = scanner.next();

        if (action.equals("status")){
            status.showStatus();
        }
    }
}