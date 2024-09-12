package equipment;

public class armors {
    //Parameters
    String name;
    int defense;
    int weight;
    int strength;
    int value;

    //Constructor
    public armors(String name, int defense, int weight, int strength, int value){
        this.name = name;
        this.defense = defense;
        this.weight = weight;
        this.strength = strength;
        this.value = value;
    }

    //Getters
    public String getName () {
        return name;
    }
    public int getDefense () {
        return defense;
    }
    public int getWeight () {
        return weight;
    }
    public int getStrength () {
        return strength;
    }
    public int getValue () {
        return value;
    }

    //List of available armors
    public static armors basicClothing = new armors("Basic Clothing", 1, 1, 1, 5);
    public static armors leatherArmor = new armors("Leather Armor", 5, 3, 3, 15);
    public static armors ironArmor = new armors("Iron Armor", 15, 5, 5, 40);
    public static armors steelArmor = new armors("Steel Armor", 30, 8, 8, 150);
    public static armors enchantedArmor = new armors("Enchanted Armor", 60, 4, 4, 800);
}
