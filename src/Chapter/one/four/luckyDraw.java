package Chapter.one.four;

import java.util.Random;
import java.util.Scanner;

/**
 * This calss provide the basic functions for lottery. The only thing you need
 * to do after allocating memory is to call the member fuction run().
 * 
 * @author Chanth Miao
 */
public class LuckyDraw {
    private int border;

    public LuckyDraw() {
        // Do nothing
    }

    private void setBorder(int borderValue) {
        this.border = borderValue;
    }

    private void getLuckyOne() {
        Random choice = new Random();
        int result = choice.nextInt(this.border + 1);
        System.out.println("The lucky one is " + result);
    }

    /**
     * This function picks a random number from the user-specified natural number
     * range, which start from zero, as the result of the lottery. It has complete
     * user interaction logic, and will not stoped unless receives quit command from
     * the user.
     */
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
        /**
         * Well, currentlly I have no choice but to disable the line below. If not, it
         * will close the static i/o stream, system.in, which is the i/o base of
         * Scanner. It should be fine with 3rd-part proxy i/o stream sulotion like
         * "org.apache.commons.io", which Iwill try later.
         */
        // getInput.close();
    }
}