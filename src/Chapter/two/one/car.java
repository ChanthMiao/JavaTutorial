package Chapter.two.one;

import java.util.Random;
import java.text.DecimalFormat;

/**
 * This class provide function to display basic info of a car.
 * 
 * @author Chanth Miao
 */
public class Car {
    private String c_colour;
    private String c_brand;
    private String c_model;

    /**
     * Init a car with basic info.
     * 
     * @param colour The colour of the car.
     * @param brand  The brand of the car
     * @param model  The model of the car.
     */
    public Car(String colour, String brand, String model) {
        this.c_colour = new String(colour);
        this.c_brand = new String(brand);
        this.c_model = new String(model);
    }

    /**
     * This function return a random speed within [0, max].
     * 
     * @param max The max speed value.
     */
    private int getCurrentSpeed(int max) {
        Random randomSpeed = new Random();
        return randomSpeed.nextInt(max + 1);
    }

    /**
     * This function return a virtual GPS set randomly.
     */
    private double[] getCurrentGPS() {
        Random randomGPS = new Random();
        double[] coordinate = { 0, 0 };
        coordinate[0] = randomGPS.nextDouble() * 180.00;
        coordinate[1] = randomGPS.nextDouble() * 180.00;
        return coordinate;
    }

    /**
     * Show the basic info of the car.
     */
    public void showBasicInfo() {
        System.out.println("brand: " + this.c_brand + "\tmodel: " + this.c_model + "\tcolour: " + this.c_colour);
        System.out.println("Current speed: " + this.getCurrentSpeed(200));
        double[] GPS = this.getCurrentGPS();
        DecimalFormat onlyTwo = new DecimalFormat("0.00");
        System.out.println(
                "Current GPS coordinate: " + "(" + onlyTwo.format(GPS[0]) + ", " + onlyTwo.format(GPS[1]) + ")");
    }
}