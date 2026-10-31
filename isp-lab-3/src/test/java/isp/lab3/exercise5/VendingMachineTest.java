package isp.lab3.exercise5;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

    @Test
    public void testInsertCoin() {
        VendingMachine vm = new VendingMachine();

        vm.insertCoin(10);
        vm.insertCoin(5);
        assertEquals("You bought:Pepsi", vm.selectProduct(29));
        assertEquals("You bought:Cola", vm.selectProduct(1));
    }

    @Test
    public void testSelectProduct() {
        VendingMachine vm = new VendingMachine();
        assertEquals("Product with id:99 not found", vm.selectProduct(99));
        vm.insertCoin(5);
        assertEquals("Error: insufficient credit for id:34", vm.selectProduct(34));
        assertEquals("You bought:7days", vm.selectProduct(2));
        assertEquals("Error: insufficient credit for id:29", vm.selectProduct(29));
    }
    @Test
    public void testdisplayProducts()
    {
        VendingMachine vm = new VendingMachine();
        String expected = "Water 12; Cola 1; Pepsi 29; MilkaChocolate 34; 7days 2; ";
        assertEquals(expected, vm.displayProducts());
    }
}