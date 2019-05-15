package Chapter.two.five;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 2-5:\n");
        Vehicles sampleVehicles = new Vehicles("大众", "黑色");
        System.out.println("Base class Vehicles:");
        sampleVehicles.showInfo();
        System.out.println("\n");
        System.out.println("child class Car:");
        Car sampleCar = new Car("大众", "黑色", 6);
        sampleCar.showInfo();
        System.out.println("\n");
    }
}