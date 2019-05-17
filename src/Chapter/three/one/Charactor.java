package Chapter.three.one;

public abstract class Charactor {
    protected String name;
    protected String role;
    protected String weapon;
    protected String skill;
    protected String lastAction;

    public Charactor(String cRole, String cWeapon, String cSkill) {
        role = cRole;
        weapon = cWeapon;
        skill = cSkill;
    }

    public abstract void switchWeapon();

    public abstract void action(int type);

    public void showInfo() {
        System.out.println("角色：" + role);
        System.out.println("武器：" + weapon);
        System.out.println("技能：" + skill);
    }
}