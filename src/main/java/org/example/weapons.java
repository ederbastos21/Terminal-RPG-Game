package org.example;

public class weapons {
    String name;
    int damage;
    int weight;
    int strength;
    int value;

    public weapons(String name, int damage, int weight, int strength, int value){
        name = this.name;
        damage = this.damage;
        weight = this.weight;
        strength = this.strength;
        value = this.value;
    }

    weapons TrainingSword = new weapons("wooden Sword", 1, 1, 1, 5);
    weapons RustySword = new weapons("wooden Sword", 5, 3, 3, 15);
    weapons SteelSword = new weapons("wooden Sword", 15, 5, 5, 40);
    weapons TitaniumSword = new weapons("wooden Sword", 30, 8, 8, 150);
    weapons EnchantedSword = new weapons("wooden Sword", 60, 4, 4, 800);

}
