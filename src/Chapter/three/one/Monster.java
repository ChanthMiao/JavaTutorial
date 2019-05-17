package Chapter.three.one;

public class Monster extends Charactor {
    public Monster(String cName) {
        super("怪物", "巨斧", "狂野板斧");
        name = cName;
    }

    public void switchWeapon() {
        String[] weaponList = { "巨斧", "金刚锤", "伏魔锁" };
        for (int i = 0; i < weaponList.length; i++) {
            if (weapon == weaponList[i]) {
                weapon = weaponList[(i + 1) % weaponList.length];
                break;
            }
        }
        System.out.println("切换武器至" + weapon);
    }

    public void action(int type) {
        if (type == 0) {
            System.out.println("咆哮");
            lastAction = "咆哮";
        } else if (type == 1) {
            System.out.println("精神震慑");
            lastAction = "精神震慑";
        } else if (type == 2) {
            System.out.println("追击");
            lastAction = "追击";
        } else {
            System.out.println("释放技能：" + skill);
            lastAction = skill;
        }
    }

    public void showInfo() {
        System.out.println("姓名：" + name);
        super.showInfo();
    }
}