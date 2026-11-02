package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private final static int MAX_SENSORS = 10;
    private final List<Sensor> sensorList;

    public MonitoringService(List<Sensor> sensorList) {
        if (sensorList.size() != MAX_SENSORS)
            throw new IllegalArgumentException("MonitoringService must have 10 Sensors!!!");
        this.sensorList = new ArrayList<>(sensorList);
    }

    public double getAverageTemperatureSensors() {
        double sum = 0;
        double nr = 0;
        System.out.print("AverageTempSensors:");
        for (Sensor s : sensorList) {
            if (s instanceof TemperatureSensor) {
                sum += ((TemperatureSensor) s).getTemperature();
                nr++;
            }
        }
        return (nr != 0) ? sum / nr : 0;
    }

    public double getAverageAllSensors() {
        double sum = 0;
        double nr = 0;
        System.out.print("\nAverageAllSensors:");
        for (Sensor s : sensorList) {
            if (s instanceof TemperatureSensor) {
                sum += ((TemperatureSensor) s).getTemperature();
                nr++;
            }
            if (s instanceof PressureSensor) {
                sum += ((PressureSensor) s).getPressure();
                nr++;
            }

        }
        return (nr != 0) ? sum / nr : 0;
    }
}
