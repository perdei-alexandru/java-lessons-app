package edu.tucn.aut.isp.lab4.exercise4;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;

import java.time.LocalTime;

public class AquariumController {

    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder fishFeeder;
    private LocalTime lightOnTime;
    private LocalTime lightsOffTime;
    private Lights lights;

    public AquariumController(String manufacturer, String model, FishFeeder fishFeeder, LocalTime feedingTime,LocalTime lightOnTime,LocalTime lightsOffTime,Lights lights) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = LocalTime.now();
        this.fishFeeder = fishFeeder;
        this.feedingTime = feedingTime;
        this.lightOnTime=lightOnTime;
        this.lightsOffTime=lightsOffTime;
        this.lights=lights;


    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        if (this.currentTime.equals(this.feedingTime)) {
            System.out.println("It's feeding time! Feeding the fish.");
            fishFeeder.feed();
        } else {
            System.out.println("Time updated to: " + currentTime + ". (Feeding time at: " + feedingTime + ")");
        }
        if (this.currentTime.equals(this.lightOnTime)) {
            lights.turnOn();
            System.out.println("Lights on, it's time:"+currentTime);
        }
        if (this.currentTime.equals(this.lightsOffTime)) {
            lights.turnOff();
            System.out.println("Lights off, it's time:"+currentTime);
        }

        }

    public LocalTime getCurrentTime() {
        return currentTime;
    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }
}
