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

    public status (String name, int health, int strength, int dexterity, int constitution, int intelligence, int charisma, int experience){
        name = this.name;
        health = this.health;
        strength = this.strength;
        dexterity = this.dexterity;
        constitution = this.constitution;
        intelligence = this.intelligence;
        charisma = this.charisma;
        experience = this.experience;
    }

    status basicCharacter = new status ("name", 10, 1, 1, 1, 1, 1, 1);
}
