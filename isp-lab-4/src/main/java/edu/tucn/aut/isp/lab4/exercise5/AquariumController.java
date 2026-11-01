package edu.tucn.aut.isp.lab4.exercise5;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;
import edu.tucn.aut.isp.lab4.exercise4.Lights;

import java.time.LocalTime;

public class AquariumController {

    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder feedeer;
    private int presetTemperature;
    private float presetLevel;
    private LevelSensor levelSensor;
    private TemperatureSensor tempSensor;
    private Actuator alarm;
    private Actuator heater;


    public AquariumController(String manufacturer, String model, FishFeeder fishFeeder, LocalTime feedingTime,LevelSensor levelSensor,TemperatureSensor tempSensor,Actuator alarm,Actuator heater,int presetTemperature,float presetLevel) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = LocalTime.now();
        this.feedeer = fishFeeder;
        this.feedingTime = feedingTime;
        this.levelSensor=levelSensor;
        this.tempSensor=tempSensor;
        this.alarm=alarm;
        this.heater=heater;
        this.presetLevel=presetLevel;
        this.presetTemperature=presetTemperature;
    }

    public void setFeedingTime(LocalTime feedingTime) {
        this.feedingTime = feedingTime;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        if (this.currentTime.equals(this.feedingTime)) {
            System.out.println("It's feeding time! Feeding the fish.");
            feedeer.feed();
        } else {
            System.out.println("Time updated to: " + currentTime + ". (Feeding time at: " + feedingTime + ")");
        }
    }

    public LocalTime getCurrentTime() {
        return currentTime;
    }
    public void checkTemperature()
    {
        if((int)tempSensor.getValue()<presetTemperature)
            heater.turnOn();

        else if((int)tempSensor.getValue()==presetTemperature)
        {
            heater.turnOff();
        }

    }
    public void checkWaterLevel()
    {
        if((float)levelSensor.getValue()<presetLevel)
            alarm.turnOn();
        else alarm.turnOff();

    }

    @Override
    public String toString() {
        return "AquariumController{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                ", feedeer=" + feedeer +
                ", presetTemperature=" + presetTemperature +
                ", presetLevel=" + presetLevel +
                ", levelSensor=" + levelSensor +
                ", tempSensor=" + tempSensor +
                ", alarm=" + alarm +
                ", heater=" + heater +
                '}';
    }
}
