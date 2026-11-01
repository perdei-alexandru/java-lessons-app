package edu.tucn.aut.isp.lab4.exercise4;

public class Lights {
    private boolean isOn;
    public Lights()
    {
        isOn=false;
    }
    public void turnOn()
    {
        isOn=true;
    }
    public void turnOff()
    {
        isOn=false;
    }

    public boolean isOn() {
        return isOn;
    }
}
