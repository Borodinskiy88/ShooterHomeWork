import weapons.*;

public class Player {
    protected Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Bow(),
                new Gun(),
                new Slingshot(),
                new MachineGun(),
                new Crossbow()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > getSlotsCount() -1 || slot < 0) {
            System.out.println("Нет такого оружия");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }

    }




}







