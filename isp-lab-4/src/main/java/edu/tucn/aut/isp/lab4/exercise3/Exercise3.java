package edu.tucn.aut.isp.lab4.exercise3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder f1 = new FishFeeder("BOSCH", "B1");
        f1.fillUp();
        LocalTime a11 = LocalTime.of(21, 0);
        AquariumController a1 = new AquariumController("AquaWater", "X2", f1, a11);
        a1.setCurrentTime(LocalTime.of(21, 0));
        a1.setCurrentTime(LocalTime.of(21, 1));


        FishFeeder f2 = new FishFeeder("BOSCH", "B2");
        f2.fillUp();
        LocalTime a111 = LocalTime.of(21, 8);

        AquariumController a2 = new AquariumController("AquaWater", "X3", f2,a111);
        a2.setCurrentTime(LocalTime.now().truncatedTo(ChronoUnit.MINUTES));



    }
}
