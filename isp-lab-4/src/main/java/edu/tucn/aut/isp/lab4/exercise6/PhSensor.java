package edu.tucn.aut.isp.lab4.exercise6;

import edu.tucn.aut.isp.lab4.exercise5.Sensor;

public class PhSensor extends Sensor {
    private int value;

    public PhSensor(String manufacturer, String model){
        super(manufacturer,model);

    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
