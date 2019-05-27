package Chapter.three.two;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 3-2:\n");
        System.out.println("Choose your charactor:");
        System.out.println("1.King");
        System.out.println("2.Queen");
        System.out.println("3.Rider");
        System.out.println("4.Monster");
        System.out.println("(选择角色进行自动行为演示)");
        Scanner getChoice = new Scanner(new InputStreamReader(System.in));
        //Scanner getChoice = new Scanner(System.in);
        try {
            int choice = getChoice.nextInt();
            switch (choice) {
            case 1:
                King sampleKing = King.getKing();
                System.out.println("国王使用长剑");
                System.out.print("释放技能：");
                sampleKing.fightUsingWeapon();
                System.out.println("切换武器至弓，释放新技能");
                sampleKing.setWeapon(new Bow());
                sampleKing.fightUsingWeapon();
                break;
            case 2:
                Queen sampleQueen = Queen.getQueen();
                System.out.println("皇后使用短刀");
                System.out.print("释放技能：");
                sampleQueen.fightUsingWeapon();
                sampleQueen.setWeapon(new Sword());
                System.out.println("切换武器至弓，释放新技能");
                sampleQueen.fightUsingWeapon();
                break;
            case 3:
                Knight sampleKnight = new Knight(new Arrow());
                System.out.println("骑士使用箭");
                System.out.print("释放技能：");
                sampleKnight.fightUsingWeapon();
                sampleKnight.setWeapon(new Bow());
                System.out.println("切换武器至弓，释放新技能");
                sampleKnight.fightUsingWeapon();
                break;
            case 4:
                Troll sampleTroll = new Troll(new Axe());
                System.out.println("怪物使用斧");
                System.out.print("释放技能：");
                sampleTroll.fightUsingWeapon();
                sampleTroll.setWeapon(new Bow());
                System.out.println("切换武器至弓，释放新技能");
                sampleTroll.fightUsingWeapon();
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