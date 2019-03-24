package Chapter.one.four;

import java.util.Random;
import java.util.Scanner;

public class luckyDraw {
    private int border;

    public luckyDraw() {
        // Do nothing
    }

    private void setBorder(int value) {
        this.border = value;
    }

    private void getLuckyOne() {
        Random choice = new Random();
        int result = choice.nextInt(this.border + 1);
        System.out.println("The lucky one is " + result);
    }

    public void run() {
        Scanner getInput = new Scanner(System.in);
        String buff = "\n";
        int userInput;
        System.out.print("Please enter a number: ");
        while (!buff.toLowerCase().equals("q")) {
            if (getInput.hasNextInt()) {
                userInput = getInput.nextInt();
                buff = getInput.nextLine();
                this.setBorder(userInput);
                getLuckyOne();
                System.out.print("Please enter a number again: ");
            } else {
                buff = getInput.nextLine();
                if (!buff.toLowerCase().equals("q")) {
                    System.out.println("Invalid input, not a integer.");
                    System.out.print("Please enter a number again: ");
                }
            }
        }
        System.out.println("Exit with " + buff);
        // Well, currentlly I have no choice but to comment the line below. If not, it
        // will close the static i/o stream, system.in, which is the i/o base of
        // Scanner. It should be fine with 3rd-part proxy i/o stream sulotion like
        // "org.apache.commons.io", which Iwill try later. getInput.close();
    }
}