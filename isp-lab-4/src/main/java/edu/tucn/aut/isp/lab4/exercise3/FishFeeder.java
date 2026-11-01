package edu.tucn.aut.isp.lab4.exercise3;


public class FishFeeder {
    private  String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model, int meals) {
        this.manufacturer = manufacturer;
        this.model = model;
        if (meals > 14) {
            System.out.println("Alert: The value " + meals + " exceeds maximum capacity.");
            System.out.println("The program automatically initialized the meals attribute with 14. for fishfeedr:"+manufacturer+" model: "+model);
        }
        this.meals = Math.min(14,meals);
    }

    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void feed() {
        if (meals > 0) {
            meals--;
            System.out.println("Feeding the fish. Meals left: " + meals);
        } else {
            System.out.println("Error: No meals left! Fill up");
        }
    }
    public void fillUp() {
        this.meals = 14;
        System.out.println("The fish feeder has been refilled.");
    }

    @Override
    public String toString() {
        return "FishFeeder{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", meals=" + meals +
                '}';
    }

    public int getMeals() {
        return meals;
    }
}
