package edu.tucn.aut.isp.lab4.exercise5;

public abstract class Actuator {
    private String manufacturer;
    private String model;
    private boolean on;


    public Actuator(String manufacturer, String model, boolean on) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.on = on;
    }

    public Actuator(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void turnOn()
    {
        this.on=true;
        System.out.println("The actuator has tripped.");
    }
    public void turnOff()
    {
        this.on=false;
        System.out.println("The actuator stopped.");

    }

    public boolean isOn() {
        return on;
    }

    @Override
    public String toString() {
        return "Actuator{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", on=" + on +
                '}';
    }
}
