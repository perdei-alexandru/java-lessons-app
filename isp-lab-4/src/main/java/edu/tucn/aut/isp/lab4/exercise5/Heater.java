package edu.tucn.aut.isp.lab4.exercise5;

public class Heater extends Actuator{
public Heater(String manufacturer,String model) {
    super(manufacturer,model);
}
@Override
    public void turnOn()
{
    super.turnOn();
    System.out.println("Heater triggered.");
}
@Override
    public void turnOff()
    {
        super.turnOff();
        System.out.println("Heater stopped.");
    }

}
