package Chapter.two.two;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 2-2:\n");
        CarPlus sampleCar = new CarPlus();
        sampleCar.setBrandString("大众");
        sampleCar.setBrandString("桑塔纳");
        sampleCar.setColorString("绿色");
        System.out.println("brand: " + sampleCar.getBrandString() + "\tmodel: " + sampleCar.getModelString()
                + "\tcolour: " + sampleCar.getColourString());
        sampleCar.getCurrentStatus();
    }
}