package equipment;

public class armors {
    String name;
    int defense;
    int weight;
    int strength;
    int value;

    public armors(String name, int defense, int weight, int strength, int value){
        name = this.name;
        defense = this.defense;
        weight = this.weight;
        strength = this.strength;
        value = this.value;
    }

    //List of Swords
    armors basicClothing = new armors("Training Sword", 1, 1, 1, 5);
    armors leatherArmor = new armors("Rusty Sword", 5, 3, 3, 15);
    armors ironArmor = new armors("Steel Sword", 15, 5, 5, 40);
    armors steelArmor = new armors("Titanium Sword", 30, 8, 8, 150);
    armors enchantedArmor = new armors("Enchanted Sword", 60, 4, 4, 800);
}
