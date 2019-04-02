package Chapter.two.one;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 2-1:\n");
        Car sampleCar = new Car("绿色", "大众", "桑塔纳");
        sampleCar.showBasicInfo();
    }
}