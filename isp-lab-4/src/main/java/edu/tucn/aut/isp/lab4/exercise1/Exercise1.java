package edu.tucn.aut.isp.lab4.exercise1;

import java.time.LocalTime;

public class Exercise1 {

    public static void main(String[] args) {
        AquariumController aquariumController=new AquariumController("BOSCH","B1");
        System.out.println(aquariumController.toString());
        aquariumController.setCurrentTime(LocalTime.of(16,50));
        System.out.println(aquariumController.toString());
        aquariumController.setCurrentTime(LocalTime.of(18,53));
        System.out.println(aquariumController.getCurrentTime());

    }
}
