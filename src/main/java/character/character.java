package character;

import equipment.armors;
import equipment.weapons;

public class character {
    //Variables
    String name;
    int health;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int charisma;
    int experience;
    weapons heldWeapon;
    armors heldArmor;

    //Character constructor
    public character (String name, int health, int strength, int dexterity, int constitution, int intelligence, int charisma, int experience) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.experience = experience;
        this.heldWeapon = weapons.TrainingSword;
        this.heldArmor = armors.basicClothing;
    }

    public void showStatus() {
        System.out.printf(
                "Name: %s \nHealth: %d \nStrength: %d \nDexterity: %d \nConstitution: %d \nIntelligence: %d \nCharisma: %d \nExperience: %d \nCurrent Weapon: %s \nCurrent Armor: %s\n",
                this.name,
                this.health,
                this.strength,
                this.dexterity,
                this.constitution,
                this.intelligence,
                this.charisma,
                this.experience,
                this.heldWeapon.getName(),  // Display weapon name
                this.heldArmor.getName()    // Display armor name
        );
    }

    //Methods to equip weapons and armors
    public void equipWeapon(weapons newWeapon){
        this.heldWeapon = newWeapon;
    }
    public void equipArmor (armors newArmor){
        this.heldArmor = newArmor;
    }

    //Access current held weapon and armor
    public weapons getHeldWeapon () {
        return heldWeapon;
    }
    public armors getHeldArmor () {
        return heldArmor;
    }
}
