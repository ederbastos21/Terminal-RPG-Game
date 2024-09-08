package org.example;
import java.util.Random;

public class room {
    Random random = new Random ();

    // Room objects
    Boolean hasEnemy = random.nextBoolean();
    Boolean hasLoot = random.nextBoolean();

    // Room modifiers
    Boolean roomLit = random.nextBoolean();
    Boolean roomDark = random.nextBoolean();

}
