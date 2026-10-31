package utcluj.aut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySecondExampleTest {



    @Test
    void even_sum() {
        assertEquals(30,MySecondExample.even_sum(10));
        assertEquals(0,MySecondExample.even_sum(0));
        assertEquals(0,MySecondExample.even_sum(1));
    }
}