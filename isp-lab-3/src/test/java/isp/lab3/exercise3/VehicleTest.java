package isp.lab3.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void testToString() {
        Vehicle vehicle22 = new Vehicle("Toyota", "RAV4", 130, 'D');
        String expected = "Toyota (RAV4) speed 130 fuel type D";
        assertEquals(expected, vehicle22.toString());
    }
}
