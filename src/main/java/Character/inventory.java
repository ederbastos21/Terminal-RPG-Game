package Character;

import equipment.armors;
import equipment.weapons;

public class inventory {
    weapons heldWeapon;
    armors heldArmor;

    //holds current weapon and armor
    public inventory() {
        this.heldWeapon = weapons.TrainingSword;
        this.heldArmor = armors.basicClothing;
    }

    //Methods to equip weapons and armors
    public void equipWeapon(weapons newWeapon){
        this.heldWeapon = newWeapon;
    }

    public void equipArmor (armors newArmor){
        this.heldArmor = newArmor;
    }

    //Access current held weapon and armor
    public weapons getHeldWeapon () {
        return heldWeapon;
    }

    public armors getHeldArmor () {
        return heldArmor;
    }
}
