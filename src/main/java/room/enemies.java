package room;

public class enemies {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int moneyDropped;

    public enemies (String name, int health, int damage, int defense, int moneyDropped){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.moneyDropped = moneyDropped;
    }

    public static enemies goblin = new enemies ("Goblin",5,3,1,10);
    public static enemies thief = new enemies ("Thief", 10, 5, 2, 20);
    public static enemies orc = new enemies ("Orc",20,8,1,40);
    public static enemies undead = new enemies ("Undead", 25, 14, 1, 50);
    public static enemies guardian = new enemies ("Guardian", 60, 25, 15, 100);
}
