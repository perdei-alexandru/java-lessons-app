package isp.lab3.example;

import java.util.Objects;

public class Car {
   private int speed;
   private String colour;
   public static final int whell=4;

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }
    public void setSpeed(int speed)
    {
        this.speed=speed;
    }
    public Car()
    {
        System.out.println("Car created");
    }
    public Car(int speed,String colour)
    {
        this.speed=speed;
        this.colour=colour;
        System.out.println("Car created with speed " +speed+ " and colour:" + colour);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, colour);
    }
}
