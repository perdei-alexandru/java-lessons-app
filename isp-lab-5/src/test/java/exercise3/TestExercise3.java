package exercise3;

import isp.lab5.exercise3.MonitoringService;
import isp.lab5.exercise3.PressureSensor;
import isp.lab5.exercise3.Sensor;
import isp.lab5.exercise3.TemperatureSensor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestExercise3 {
    @Test
    public void testPolimorfism() {
        Sensor s1 = new TemperatureSensor(24, "Lupcina", "tempsensor");
        Sensor s2 = new PressureSensor(8, "Radauti", "pressureSensor");
        List<Sensor> sensorList = List.of(s1, s2, s1, s2, s2, s2, s1, s2, s2, s1);
        MonitoringService monitoringService = new MonitoringService(sensorList);
        System.out.println(monitoringService.getAverageTemperatureSensors());
        System.out.println(monitoringService.getAverageAllSensors());
        assertEquals(24, monitoringService.getAverageTemperatureSensors(), 0.001);
        assertEquals(14.4, monitoringService.getAverageAllSensors(), 0.001);
    }
}
