package room;
import java.util.Random;

public class room {
    //create randomizer
    static Random random = new Random();
    String name;
    boolean hasEnemy;
    boolean hasLoot;
    boolean isLit;
    boolean isDark;

    //Constructor
    public room (String name, boolean hasEnemy, boolean hasLoot, boolean isLit, boolean isDark){
        this.name = name;
        this.hasEnemy = hasEnemy;
        this.hasLoot = hasLoot;
        this.isLit = isLit;
        this.isDark = isDark;
    }

    //Getters and Setter
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public boolean getHasEnemy(){
        return hasEnemy;
    }
    public void setHasEnemy(boolean hasEnemy){
        this.hasEnemy = hasEnemy;
    }

    public boolean getHasLoot(){
        return hasLoot;
    }
    public void setHasLoot(boolean hasLoot){
        this.hasLoot = hasLoot;
    }

    public boolean getIsLit(){
        return isLit;
    }
    public void setIsLit(boolean isLit){
        this.isLit = isLit;
    }

    public boolean getIsDark () {
        return isDark;
    }
    public void setIsDark (boolean isDark){
        this.isDark = isDark;
    }

    public static room createRandomRoom(String name){
        boolean hasEnemy = random.nextBoolean();
        boolean hasLoot = random.nextBoolean();
        boolean isLit = random.nextBoolean();
        boolean isDark = !isLit && random.nextBoolean();
        return new room (name, hasEnemy, hasLoot, isLit, isDark);
    }

    @Override
    public String toString(){
        return "Room: " + name +
                "\nHas Enemy: " + hasEnemy +
                "\nHas Loot: " + hasLoot +
                "\nIs Lit: " + isLit +
                "\nIs Dark: " + isDark;
    }

}
