package Chapter.two.four;

import java.util.Random;

public class Vehicles {
    private String band;
    private String color;

    public Vehicles() {
        // Do nothing
    }

    public String getBand() {
        return new String(band);
    }

    public void setBand(String bandStr) {
        band = new String(bandStr);
    }

    public String getColor() {
        return new String(color);
    }

    public void setColor(String colorStr) {
        color = new String(colorStr);
    }

    public double currentSpeed() {
        Random randomSpeed = new Random();
        return randomSpeed.nextDouble() * 240.0;
    }

    public void showInfo() {
        System.out.print("Band: " + band + "\tColor: " + color);
    }
}