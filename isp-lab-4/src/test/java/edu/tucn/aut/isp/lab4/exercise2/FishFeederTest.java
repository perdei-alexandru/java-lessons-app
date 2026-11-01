package edu.tucn.aut.isp.lab4.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FishFeederTest {
    @Test
    public void testfillUp()
    {
        FishFeeder f1=new FishFeeder("Emerson","D1");
    f1.fillUp();
    assertEquals(14,f1.getMeals());

    }
    @Test
    public void testFeed()
    {
       FishFeeder f2=new FishFeeder("Aqua-Water","C1",1000);
       f2.feed();
       assertEquals(13,f2.getMeals());
       FishFeeder f3=new FishFeeder("Aqua-Water","C2",0);
       f3.feed();;
    }
}
