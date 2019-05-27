package Chapter.three.two;

public class Character {
    private Weapon weapon;

    public Character(Weapon aWeapon) {
        weapon = aWeapon;
    }

    public void setWeapon(Weapon aNewWeapon) {
        weapon = aNewWeapon;
    }

    public void fightUsingWeapon() {
        if (weapon == null) {
            System.out.println("No weapon available!");
        } else {
            weapon.fight();
        }
    }
}