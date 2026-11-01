package edu.tucn.aut.isp.lab4.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AquariumControllerTest {
    //implement minimal tests
    @Test
    void dummyTestNPE() {
        Assertions.assertThrows(
                NullPointerException.class, () -> {
                    Integer nullInt = null;
                    nullInt.toString();
                });
    }
   @Test
          public  void testTime()
        {
            AquariumController ac=new AquariumController("BOSCH","B1");
            ac.setCurrentTime(LocalTime.of(16,54));
            String expected="16:54";
            assertEquals(expected,ac.getCurrentTime().toString());
        }
        @Test
    public void testToString()
        {
            AquariumController aquariumController=new AquariumController("BOSCH","B1");
            String expected="AquariumController{manufacturer='BOSCH', model='B1', currentTime=null}";
           assertEquals(expected,aquariumController.toString());
            String expected1="AquariumController{manufacturer='BOSCH', model='B1', currentTime=19:00}";
            aquariumController.setCurrentTime(LocalTime.of(19,00));
            assertEquals(expected1,aquariumController.toString());

        }

}
