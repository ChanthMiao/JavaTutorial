package Chapter.three.two;

public class King extends Character{
    private static King king;

    private King(Weapon aWeapon){
        super(aWeapon);
    }

    public static King getKing(){
        if(king == null){
            king = new King(new Sword());
        }
        return king;
    }
}