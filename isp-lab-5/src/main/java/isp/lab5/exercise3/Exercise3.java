package isp.lab5.exercise3;

import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        Sensor s1 = new TemperatureSensor(24, "Lupcina", "tempsensor");
        Sensor s2 = new PressureSensor(8, "Radauti", "pressureSensor");
        List<Sensor> sensorList = List.of(s1, s2, s1, s2, s2, s2, s1, s2, s2, s1);
        MonitoringService monitoringService = new MonitoringService(sensorList);
        System.out.println(monitoringService.getAverageTemperatureSensors());
        System.out.println(monitoringService.getAverageAllSensors());
    }
}
