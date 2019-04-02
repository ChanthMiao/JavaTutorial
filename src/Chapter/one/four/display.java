package Chapter.one.four;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 1-4-1:\n");
        Factor sampleFactor = new Factor(5);
        System.out.println("5! = " + sampleFactor.getResult());
        System.out.println("\nclasswork 1-4-2:\n");
        LuckyDraw sampleLuckyDraw = new LuckyDraw();
        sampleLuckyDraw.run();
    }
}