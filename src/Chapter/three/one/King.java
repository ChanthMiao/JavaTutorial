package Chapter.three.one;

public class King extends Charactor {
    public King(String cName) {
        super("国王", "长剑", "剑雨");
        name = cName;
    }

    public void switchWeapon() {
        String[] weaponList = { "长剑", "权杖", "毒药" };
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
            System.out.println("追击");
            lastAction = "追击";
        } else if (type == 1) {
            System.out.println("进行防守");
            lastAction = "进行防守";
        } else if (type == 2) {
            System.out.println("闪避");
            lastAction = "闪避";
        } else {
            System.out.println("释放技能：" + skill);
            lastAction = skill;
        }
    }

    public void showInfo() {
        System.out.println("姓名：" + name);
        super.showInfo();
        System.out.println("最近动作：" + lastAction);
    }
}