package edu.tucn.aut.isp.lab4.exercise5;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;


import java.time.LocalTime;

public class Exercise5 {
    public static void main(String[] args) {
        FishFeeder f1 = new FishFeeder("Bosch", "F1", 100);
        LevelSensor levelSensor = new LevelSensor("Emerson", "S1");
        levelSensor.setValue(10);
        TemperatureSensor tempSensor = new TemperatureSensor("Emerson", "S2");
        tempSensor.setValue(10);
        Actuator actuatorAlarm = new Alarm("Bosch", "Alarm1");
        Actuator actuatorHeater = new Heater("Bosch", "Heather1");
        AquariumController a1 = new AquariumController("Bosch", "B1", f1, LocalTime.of(17, 0), levelSensor, tempSensor, actuatorAlarm, actuatorHeater, 23, 40);
        a1.checkTemperature();
        a1.checkWaterLevel();
        a1.setCurrentTime(LocalTime.of(17, 0));
        a1.setFeedingTime(LocalTime.of(20, 0));
        a1.setCurrentTime(LocalTime.of(17, 0));
        System.out.println(a1.toString());
        System.out.println(levelSensor.toString());
        Sensor sensor=new Sensor() {
        }



    }

}
