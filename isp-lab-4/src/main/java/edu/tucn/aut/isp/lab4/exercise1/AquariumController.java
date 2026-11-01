package edu.tucn.aut.isp.lab4.exercise1;

import java.time.LocalTime;

public class AquariumController {

   private String manufacturer;
   private String model;
   private LocalTime currentTime;

    public AquariumController(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
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
