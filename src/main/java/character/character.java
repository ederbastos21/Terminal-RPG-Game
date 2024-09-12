package character;

import equipment.armors;
import equipment.weapons;

public class character {
    //Variables
    private String name;
    private int health;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int charisma;
    private int experience;
    private weapons heldWeapon;
    private armors heldArmor;

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

    //Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getDexterity(){
        return dexterity;
    }
    public void setDexterity(int dexterity){
        this.dexterity = dexterity;
    }

    public int getConstitution(){
        return constitution;
    }
    public void setConstitution(int constitution){
        this.constitution = constitution;
    }

    public int getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getCharisma(){
        return charisma;
    }
    public void setCharisma(int charisma){
        this.charisma = charisma;
    }

    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
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

    //Actions
    public int dealDamage(){
        return (this.heldWeapon.getDamage());
    }
}
