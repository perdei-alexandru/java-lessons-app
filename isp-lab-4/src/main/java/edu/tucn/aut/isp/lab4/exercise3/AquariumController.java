package edu.tucn.aut.isp.lab4.exercise3;

import java.time.LocalTime;

public class AquariumController {

    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder fishFeeder;

    public AquariumController(String manufacturer, String model, FishFeeder fishFeeder, LocalTime feedingTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = LocalTime.now();
        this.fishFeeder = fishFeeder;
        this.feedingTime = feedingTime;

    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        if (this.currentTime.equals(this.feedingTime)) {
            System.out.println("It's feeding time! Feeding the fish.");
            fishFeeder.feed();
        } else {
            System.out.println("Time updated to: " + currentTime + ". (Feeding time at: " + feedingTime + ")");
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
