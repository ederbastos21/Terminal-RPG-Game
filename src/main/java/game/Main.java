package game;
import equipment.weapons;
import equipment.armors;
import character.inventory;
import character.status;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("This is your current character");
        System.out.println("He currently has", inventory.heldWeapon, );
    }
}