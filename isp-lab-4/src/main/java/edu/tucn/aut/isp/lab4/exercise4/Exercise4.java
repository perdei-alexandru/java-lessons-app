package edu.tucn.aut.isp.lab4.exercise4;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exercise4 {
    public static void main(String[] args) {
        Lights l1 = new Lights();
        FishFeeder f1 = new FishFeeder("Bosch", "F1");
        AquariumController a1 = new AquariumController("Bosch", "B1", f1, LocalTime.of(13, 1), LocalTime.of(13, 1), LocalTime.of(20, 0), l1);
        a1.setCurrentTime(LocalTime.of(13, 1));


        Lights l2 = new Lights();
        FishFeeder f2 = new FishFeeder("Bosch", "F2");
        AquariumController a2 = new AquariumController("Bosch", "B2", f2, LocalTime.of(13, 1), LocalTime.of(13, 1), LocalTime.of(20, 0), l2);
        a2.setCurrentTime(LocalTime.of(20, 0));

    }
}
