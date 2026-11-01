package edu.tucn.aut.isp.lab4.exercise6;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;
import edu.tucn.aut.isp.lab4.exercise5.*;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestExercise6 {
   @Test
    public void testPhActivation(){
        FishFeeder f1 = new FishFeeder("Bosch", "F1", 100);
        LevelSensor levelSensor = new LevelSensor("Emerson", "S1");
        levelSensor.setValue(10);
        TemperatureSensor tempSensor = new TemperatureSensor("Emerson", "S2");
        tempSensor.setValue(10);
        PhSensor phSensor=new PhSensor("Bosch","P11");
        phSensor.setValue(6);
        Actuator actuatorAlarm = new Alarm("Bosch", "Alarm1");
        Actuator actuatorHeater = new Heater("Bosch", "Heather1");
        Actuator actuatorPhRegulator=new PhRegulator("Bosch","P1");
        AquariumController a1 = new AquariumController("Bosch", "B1", f1, LocalTime.of(17, 0), levelSensor, tempSensor, actuatorAlarm, actuatorHeater, 23, 40,phSensor,7,actuatorPhRegulator);
        a1.checkPhLevel();
        assertEquals(true,actuatorPhRegulator.isOn());
        phSensor.setValue(3);
        a1.checkPhLevel();
        assertEquals(true,actuatorPhRegulator.isOn());
        assertEquals(true,actuatorAlarm.isOn());

        phSensor.setValue(10);
        a1.checkPhLevel();
       assertEquals(false,actuatorPhRegulator.isOn());
       assertEquals(true,actuatorAlarm.isOn());

    }
}
