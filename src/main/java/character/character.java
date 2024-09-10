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

    //Constructor
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

    public static status basicCharacter = new status ("name", 10, 1, 1, 1, 1, 1, 1);

    public void showStatus (){
        System.out.printf("Name: %s \n Health: %d \n Strength %d \n Dexterity %d \n Constitution %d \n Intelligence %d \n Charisma: %d \n Experience: %d \n",
                basicCharacter.name,
                basicCharacter.health,
                basicCharacter.strength,
                basicCharacter.dexterity,
                basicCharacter.constitution,
                basicCharacter.intelligence,
                basicCharacter.charisma,
                basicCharacter.experience
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
