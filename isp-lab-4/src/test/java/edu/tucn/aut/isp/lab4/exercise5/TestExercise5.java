package edu.tucn.aut.isp.lab4.exercise5;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;

public class TestExercise5 {
@Test
    public void testHeater_Alarm_ActivationwithPolimorfism()
{
    FishFeeder f1=new FishFeeder("Aqua-Water","F1",11);
    LevelSensor l1=new LevelSensor("Emerson","L1");
    TemperatureSensor t1=new TemperatureSensor("Emerson","T1");
    Actuator heater=new Heater("Bosch","H1");
    Actuator alarm=new Alarm("Bosch","A1");

    AquariumController aquariumController=new AquariumController("Bosch","B1",f1, LocalTime.of(19,0),l1,t1,alarm,heater,24,30);
    aquariumController.setCurrentTime(LocalTime.of(19,0));
    assertEquals(10,f1.getMeals());
    t1.setValue(12);
    aquariumController.checkTemperature();
    assertEquals(true,heater.isOn());
    l1.setValue(25);
    aquariumController.checkWaterLevel();
    assertEquals(true,alarm.isOn());
    t1.setValue(24);
    aquariumController.checkTemperature();
    assertEquals(false,heater.isOn());
    l1.setValue(30);
    aquariumController.checkWaterLevel();
    assertEquals(false,alarm.isOn());
}
}
