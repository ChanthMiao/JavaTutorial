package Chapter.two.four;

import java.text.DecimalFormat;

public class Car extends Vehicles {
    private int seats;

    public Car() {
        // Do nothing
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seatsNum) {
        seats = seatsNum;
    }

    public void showCar() {
        showInfo();
        System.out.println("\tSeats: " + seats);
        DecimalFormat onlyTwo = new DecimalFormat("0.00");
        System.out.print("\nCurrent speed: " + onlyTwo.format(currentSpeed()) + "km/h");
    }
}