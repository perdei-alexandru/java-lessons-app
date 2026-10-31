package isp.lab3.exercise6;

import isp.lab3.exercise6.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
    @Test
    public void testSingletone()
    {
        VendingMachine v1=VendingMachine.getInstance();
        VendingMachine v2=VendingMachine.getInstance();
        assertEquals(true,v1==v2);
    }
}
