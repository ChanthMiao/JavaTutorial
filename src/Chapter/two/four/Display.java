package Chapter.two.four;

/**
 * This class provide a static function to show all the classwork that belong to
 * the same section.
 * 
 * @author Chanth Miao
 */
public class Display {
    public static void now() {
        System.out.println("\nclasswork 2-4:\n");
        Vehicles sampleVehicles = new Vehicles();
        System.out.println("Base class Vehicles:");
        sampleVehicles.setBand("大众");
        sampleVehicles.setColor("黑色");
        sampleVehicles.showInfo();
        System.out.println("\n");
        System.out.println("child class Car:");
        Car sampleCar = new Car();
        sampleCar.setBand("大众");
        sampleCar.setColor("黑色");
        sampleCar.setSeats(6);
        sampleCar.showCar();
        System.out.println("\n");
    }
}