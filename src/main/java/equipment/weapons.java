package equipment;

public class weapons {
    String name;
    int damage;
    int weight;
    int strength;
    int value;

    //constructor
    public weapons(String name, int damage, int weight, int strength, int value){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.strength = strength;
        this.value = value;
    }

    //Getters
    public String getName () {
        return name;
    }
    public int getDamage () {
        return damage;
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

    //List of Swords
    public static weapons TrainingSword = new weapons("Training Sword", 1, 1, 1, 5);
    public static weapons RustySword = new weapons("Rusty Sword", 5, 3, 3, 15);
    public static weapons SteelSword = new weapons("Steel Sword", 15, 5, 5, 40);
    public static weapons TitaniumSword = new weapons("Titanium Sword", 30, 8, 8, 150);
    public static weapons EnchantedSword = new weapons("Enchanted Sword", 60, 4, 4, 800);

}