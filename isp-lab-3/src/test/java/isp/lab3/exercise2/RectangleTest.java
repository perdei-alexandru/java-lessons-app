package isp.lab3.exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testArea_Perimeter() {
        Rectangle rectangle1 = new Rectangle(5, 3);
        assertEquals(15, rectangle1.getArea());
        assertEquals(16, rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(10, 1);
        assertEquals(10, rectangle2.getArea());
        assertEquals(22, rectangle2.getPerimeter());
    }

    @Test
    public void test_Constructors() {
        Rectangle rectangle2 = new Rectangle(0, 3);
        assertEquals(2, rectangle2.getLength());
        assertEquals(3, rectangle2.getWidth());
        Rectangle rectangle3 = new Rectangle(0, -1);
        assertEquals(2, rectangle3.getLength());
        assertEquals(1, rectangle3.getWidth());
    }
}
