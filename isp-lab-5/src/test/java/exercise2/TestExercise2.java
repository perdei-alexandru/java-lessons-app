package exercise2;

import isp.lab5.exercise2.Chargeable;
import isp.lab5.exercise2.Laptop;
import isp.lab5.exercise2.SmartPhone;
import isp.lab5.exercise2.SmartWatch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise2 {
    @Test
    public void testPolimorfism() {
        Chargeable smartwatch = new SmartWatch();
        Chargeable smartphone = new SmartPhone();
        Chargeable laptop = new Laptop();
        smartwatch.charge(10);
        smartphone.charge(10);
        laptop.charge(10);
        assertEquals(20, smartwatch.getBatteryLevel());
        assertEquals(10, smartphone.getBatteryLevel());
        assertEquals(30, laptop.getBatteryLevel());


    }
}
