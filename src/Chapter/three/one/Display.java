package Chapter.three.one;

import java.util.Scanner;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 3-1:\n");
        System.out.println("x");
        System.out.println("Choose your charactor:");
        System.out.println("1.King");
        System.out.println("2.Queen");
        System.out.println("3.Rider");
        System.out.println("4.Monster");
        System.out.println("(选择角色进行自动行为演示)");
        Scanner getChoice = new Scanner(System.in);
        try {
            int choice = getChoice.nextInt();
            switch (choice) {
            case 1:
                King sampleKing = new King("阿方索");
                sampleKing.showInfo();
                System.out.println("武器切换测试：");
                for (int i = 0; i < 3; i++) {
                    sampleKing.switchWeapon();
                }
                System.out.println("动作测试");
                for (int i = 0; i < 4; i++) {
                    sampleKing.action(i);
                }
                break;
            case 2:
                Queen sampleQueen = new Queen("玛莉");
                sampleQueen.showInfo();
                System.out.println("武器切换测试：");
                for (int i = 0; i < 3; i++) {
                    sampleQueen.switchWeapon();
                }
                System.out.println("动作测试");
                for (int i = 0; i < 3; i++) {
                    sampleQueen.action(i);
                }
                break;
            case 3:
                Rider sampleRider = new Rider("卢瑟");
                sampleRider.showInfo();
                System.out.println("武器切换测试：");
                for (int i = 0; i < 3; i++) {
                    sampleRider.switchWeapon();
                }
                System.out.println("动作测试");
                for (int i = 0; i < 4; i++) {
                    sampleRider.action(i);
                }
                break;
            case 4:
                Monster sampleMonster = new Monster("卡尔");
                sampleMonster.showInfo();
                System.out.println("武器切换测试：");
                for (int i = 0; i < 3; i++) {
                    sampleMonster.switchWeapon();
                }
                System.out.println("动作测试：");
                for (int i = 0; i < 4; i++) {
                    sampleMonster.action(i);
                }
                break;
            default:
                System.out.println("Invalid input, exiting...");
                break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input, exiting...");
        }
    }
}