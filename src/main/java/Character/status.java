package Character;

public class status {

    String name;
    int health;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int charisma;
    int experience;

    public status(String name, int health, int strength, int dexterity, int constitution, int intelligence, int charisma, int experience) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.experience = experience;
    }


    public static status basicCharacter = new status ("name", 10, 1, 1, 1, 1, 1, 1);
}
