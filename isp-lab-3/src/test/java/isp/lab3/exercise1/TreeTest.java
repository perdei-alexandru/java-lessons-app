package isp.lab3.exercise1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    @Test
    public void testGrow() {
        Tree tree = new Tree();
        tree.grow(5);
        assertEquals(20, tree.getHeight());

        tree.grow(-2);
        assertEquals(20, tree.getHeight());
    }

    @Test
    public void testToString() {
        Tree tree = new Tree();
        String expected = "Tree{height=15}";
        assertEquals(expected, tree.toString());
    }

}
