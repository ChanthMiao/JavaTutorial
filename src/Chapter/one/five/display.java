package Chapter.one.five;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class display {
    public static void now() {
        System.out.println("\nclasswork 1-5-1:\n");
        int[] data = { 21, 3, -2, 119, -51, 118, 156, 90, 88 };
        array sampleArray = new array(data);
        System.out.print("Tested array: ");
        sampleArray.showArray();
        System.out.println("Max value: " + sampleArray.maxElem() + " Min value: " + sampleArray.minElem());

        System.out.println("\nclasswork 1-5-2:\n");
        Score sampleScores = new Score(50, 5);
        sampleScores.showBaseInfo();
    }
}