package edu.tucn.aut.isp.lab4.exercise6;

import edu.tucn.aut.isp.lab4.exercise5.Actuator;

public class PhRegulator extends Actuator {

    public PhRegulator(String manufacturer,String model){
        super(manufacturer,model);
    }
    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("PhRegulator triggered.\n");
    }
    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("PhRegulator stopped.\n");
    }



}
