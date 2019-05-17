package Chapter.three.one;

public class Queen extends Charactor {
    public Queen(String cName) {
        super("皇后", "短剑", "无声背刺");
        name = cName;
    }

    public void switchWeapon() {
        String[] weaponList = { "短剑", "毒针", "铁处女" };
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
            System.out.println("闪避");
            lastAction = "闪避";
        } else if (type == 1) {
            System.out.println("进行防守");
            lastAction = "进行防守";
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