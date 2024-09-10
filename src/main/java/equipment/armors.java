package equipment;

public class armors {
    String name;
    int defense;
    int weight;
    int strength;
    int value;

    //constructor
    public armors(String name, int defense, int weight, int strength, int value){
        this.name = name;
        this.defense = defense;
        this.weight = weight;
        this.strength = strength;
        this.value = value;
    }

    //List of Swords
    public static armors basicClothing = new armors("Training Sword", 1, 1, 1, 5);
    public static armors leatherArmor = new armors("Rusty Sword", 5, 3, 3, 15);
    public static armors ironArmor = new armors("Steel Sword", 15, 5, 5, 40);
    public static armors steelArmor = new armors("Titanium Sword", 30, 8, 8, 150);
    public static armors enchantedArmor = new armors("Enchanted Sword", 60, 4, 4, 800);
}
