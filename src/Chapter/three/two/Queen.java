package Chapter.three.two;

public class Queen extends Character {
    private static Queen king;

    private Queen(Weapon aWeapon) {
        super(aWeapon);
    }

    public static Queen getQueen() {
        if (king == null) {
            king = new Queen(new Knife());
        }
        return king;
    }
}