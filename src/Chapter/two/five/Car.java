package Chapter.two.five;

import java.text.DecimalFormat;
import java.util.Random;

public class Car extends Vehicles {
    private int seats;

    public Car(String bandStr, String colorStr, int seatsValue) {
        super(bandStr, colorStr);
        seats = seatsValue;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seatsNum) {
        seats = seatsNum;
    }

    public void showInfo() {
        System.out.print("Band: " + this.getBand() + "\tColor: " + this.getColor());
        System.out.println("\tSeats: " + seats);
        DecimalFormat onlyTwo = new DecimalFormat("0.00");
        System.out.print("\nCurrent speed: " + onlyTwo.format(currentSpeed()) + "km/h");
    }
    
    public double currentSpeed() {
        Random randomSpeed = new Random();
        return randomSpeed.nextDouble() * 180.0;
    }
}