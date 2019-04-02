package Chapter.two.two;

import java.util.Random;
import java.text.DecimalFormat;

/**
 * This class is the plus version of {@link Chapter.two.one.car}
 * 
 * @author Chanth Miao
 */
public class CarPlus {
    private String c_colour;
    private String c_brand;
    private String c_model;

    /**
     * Default constructor, almost does nothing.
     */
    public CarPlus() {
        this.c_brand = null;
        this.c_colour = null;
        this.c_model = null;
    }

    /**
     * Init a car with basic info.
     * 
     * @param colour The colour of the car.
     * @param brand  The brand of the car
     * @param model  The model of the car.
     */
    public CarPlus(String colour, String brand, String model) {
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
     * Get current status of the car.
     */
    public void getCurrentStatus() {
        System.out.println("Current speed: " + this.getCurrentSpeed(200));
        double[] GPS = this.getCurrentGPS();
        DecimalFormat onlyTwo = new DecimalFormat("0.00");
        System.out.println(
                "Current GPS coordinate: " + "(" + onlyTwo.format(GPS[0]) + ", " + onlyTwo.format(GPS[1]) + ")");
    }

    /**
     * Get the color of this car.
     * 
     * @return The color string.
     */
    public String getColourString() {
        return this.c_colour;
    }

    /**
     * Get the brand of this car.
     * 
     * @return The brand string.
     */
    public String getBrandString() {
        return this.c_brand;
    }

    /**
     * Get the model of this car.
     * 
     * @return The model string.
     */
    public String getModelString() {
        return this.c_model;
    }

    /**
     * Set the colour of this car.
     * 
     * @param colourString The colour string.
     */
    public void setColorString(String colourString) {
        this.c_colour = colourString;
    }

    /**
     * Set the brand of this car.
     * 
     * @param brandString The brand string.
     */
    public void setBrandString(String brandString) {
        this.c_brand = brandString;
    }

    /**
     * Set the model of this car.
     * 
     * @param modelString The model string.
     */
    public void setModelString(String modelString) {
        this.c_model = modelString;
    }
}