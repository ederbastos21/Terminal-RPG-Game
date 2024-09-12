package game;
import room.room;
import character.character;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create scanner and random
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        //Create character object
        character myCharacter = new character("", 1, 1, 1, 1, 1, 1, 1);

        //Declare variables
        String action;

        //Get character name
        System.out.print("Welcome to the game. Please type the name of your character: ");
        while (true) {
            String characterName = scanner.next();
            if (characterName.matches("[a-zA-Z]+")){
                myCharacter.setName(characterName);
                break;
            } else {
                System.out.print("Please place a valid character name (text only): ");
            }
        }

        System.out.println("At any point, if you want to check the commands, type /commands.");

        // Create random rooms (between 1 and 3)
        room [] rooms = new room[random.nextInt(3)+1];
        for (int i=0; i<rooms.length; i++){
            rooms[i] = room.createRandomRoom("Room"+(i));
        }

        //Main game loop
        while (true) {
            action = scanner.next();
            if (action.equalsIgnoreCase("/commands")) {
                System.out.print("LIST OF COMMANDS: \n status - Shows character's status \n");
            } else if (action.equalsIgnoreCase("status")){
                myCharacter.showStatus();
            } else if (action.equalsIgnoreCase("showRooms")){
                for (room room : rooms){
                    System.out.println(room);
                }
            } else {
                System.out.println("Command not recognized. Type /commands to check all available commands");
            }
        }
    }
}