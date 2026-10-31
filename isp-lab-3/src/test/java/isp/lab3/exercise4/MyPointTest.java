package isp.lab3.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void TestDistance() {
        MyPoint punct = new MyPoint(3, 4, 0);
        MyPoint punct1 = new MyPoint(0, 0, 0);
        MyPoint punct2 = new MyPoint(10, 10, 10);

        assertEquals("Distance method testing with parameters x, y, z:", 5.0, punct.distance(0, 0, 0), 0.001);
        assertEquals("Distance method testing with object parameter", 5.0, punct.distance(punct1), 0.001);
        assertEquals("Distance from one point to the same point", 0.0, punct1.distance(punct1), 0.001);
        assertEquals("Distance method testing with parameters x, y, z:", 17.32, punct2.distance(0, 0, 0), 0.001);
    }
}
