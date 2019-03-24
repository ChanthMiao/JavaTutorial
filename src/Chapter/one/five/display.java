package Chapter.one.five;

public class display {
    public static void now() {
        System.out.println("\nclasswork 1-5-1:\n");
        int[] data = { 21, 3, -2, 119, -51, 118, 156, 90, 88 };
        array sampleArray = new array(data);
        System.out.print("Tested array: ");
        int len = data.length;
        for (int i = 0; i < len; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        System.out.println("Max value: " + sampleArray.maxElem() + " Min value: " + sampleArray.minElem());

        System.out.println("\nclasswork 1-5-2:\n");
        Score sampleScores = new Score(50, 5);
        sampleScores.showBaseInfo();
    }
}