package edu.tucn.aut.isp.lab4.exercise4;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAggregationAquariumController {

    @Test
    public void testAquariumController() {
        Lights l1 = new Lights();
        FishFeeder f1 = new FishFeeder("Bosch", "F1");
        AquariumController a1 = new AquariumController("Bosch", "B1", f1, LocalTime.of(13, 1), LocalTime.of(13, 1), LocalTime.of(20, 0), l1);
        a1.setCurrentTime(LocalTime.of(13, 1));
        assertEquals(true, l1.isOn());

        Lights l2 = new Lights();
        FishFeeder f2 = new FishFeeder("Bosch", "F2");
        AquariumController a2 = new AquariumController("Bosch", "B2", f2, LocalTime.of(13, 1), LocalTime.of(13, 1), LocalTime.of(20, 0), l2);
        a2.setCurrentTime(LocalTime.of(20, 0));
        assertEquals(false, l2.isOn());
    }
}