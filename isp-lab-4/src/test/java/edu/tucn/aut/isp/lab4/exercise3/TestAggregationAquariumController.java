package edu.tucn.aut.isp.lab4.exercise3;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAggregationAquariumController {
    @Test
    public void TestFeedingTime() {
        FishFeeder f1 = new FishFeeder("Bosch", "F2", 10000);
        AquariumController aquariumController = new AquariumController("Bosch", "B1", f1, LocalTime.of(21, 21));
        LocalTime localTime = LocalTime.of(21, 21);
        aquariumController.setCurrentTime(localTime);
        assertEquals(13, f1.getMeals());


    }
}
