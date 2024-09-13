package game;
import equipment.armors;
import equipment.weapons;
import room.room;
import character.character;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create scanner and random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Create character object
        character myCharacter = new character("", 1, 1, 1, 1, 1, 1, 1);

        //Declare variables
        String action;

        //Get character name
        System.out.print("Welcome to the game. Please type the name of your character: ");
        while (true) {
            String characterName = scanner.next();
            if (characterName.matches("[a-zA-Z]+")) {
                myCharacter.setName(characterName);
                break;
            } else {
                System.out.print("Please place a valid character name (text only): ");
            }
        }

        System.out.println("At any point, if you want to check the commands, type /commands. \n");

        // Create random rooms (between 1 and 3)
        room[] rooms = new room[random.nextInt(3) + 1];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = room.createRandomRoom("Room" + (i));
        }

        //Create arrays which tells you which room you are currently on
        room[] currentRoom = new room[1];

        //Introduce player into the game's universe
        System.out.println("Hello " + myCharacter.getName() + " and welcome to the world of Eldoria");
        System.out.println("It turns out you fell into a dungeon and there's no turning back huh?");
        System.out.println("*With your blurred vision you notice a black shade talking with you*");
        System.out.println("I heard that those who fall here never come back");
        System.out.println("But you might be wondering, who am I? Your imagination, your savior, an enemy?");
        System.out.println("I guess I will leave that thought up to you");
        System.out.println("For now, will you get up and grab that sword and armor in that chest over there?");
        System.out.println("\nYou notice a training sword and a basic armor dropped in the ground, grab it? (type yes // no)");
        action = scanner.next();
        //Process equipping weapons and armors
        while (true) {
            if (action.equalsIgnoreCase("yes")) {
                myCharacter.equipArmor(armors.basicClothing);
                myCharacter.equipWeapon(weapons.TrainingSword);
                System.out.println("\nMuch better, right?");
                break;
            } else if (action.equalsIgnoreCase("no")) {
                myCharacter.equipWeapon(weapons.noWeapon);
                myCharacter.equipArmor(armors.noArmor);
                System.out.println("\nSo you think you are strong huh? Let's see how long you'll last without equipment");
                break;
            } else {
                System.out.print("please enter a valid command: ");
                action = scanner.next();
            }
        }
        System.out.println("\n You notice that the figure vanishes as you reach for the equipment, and you see " + rooms.length + " Rooms in front of you. \n ");
        for (room room : rooms) {
            System.out.println(room);
        }
        System.out.println("\n I guess you don't have any choice. Type room(roomNumber) to enter one of them (eg. room1)");

        //Checks if user placed an existing room
        while (true) {
            action = scanner.next();

            boolean roomFound = false;

            for (int i = 0; i < rooms.length; i++) {
                if (action.equalsIgnoreCase("room" + i)) {
                    System.out.println("You are inside room " + i);
                    roomFound = true;
                    break;
                }
            }
            if (!roomFound) {
                System.out.println("Invalid command, please enter a valid room.");
            } else {
                break;
            }
        }



        //Main game loop
        while (true) {
            action = scanner.next();
            if (action.equalsIgnoreCase("/commands")) {
                System.out.println("LIST OF COMMANDS: \n status - Shows character's status \n rooms - Shows all rooms and their modifiers");
            } else if (action.equalsIgnoreCase("status")) {
                myCharacter.showStatus();
            } else if (action.equalsIgnoreCase("rooms")) {
                for (room room : rooms) {
                    System.out.println(room);
                }
            } else {
                System.out.println("Command not recognized. Type /commands to check all available commands");
            }
        }
    }
}