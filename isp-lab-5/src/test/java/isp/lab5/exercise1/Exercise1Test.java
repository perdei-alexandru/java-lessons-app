package isp.lab5.exercise1;


import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Test
    public void testExercise1() {
        Address address1 = new Address("Calea Bucovinei", "Radauti");
        Customer customer1 = new Customer("Alex1234", "Perdei Alexandru", "0722663387", address1);
        ProductCategory productCategory = ProductCategory.ELECTRONICS;
        Product product1 = new Product("product1234", "Fridge", 2000, productCategory);
        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        productList.add(product1);
        Order order1 = new Order("Order1234", LocalDateTime.of(2026, 4, 1, 20, 57), customer1, productList);
        String expected = "Order{customer=Perdei Alexandru, products=[Fridge, Fridge, Fridge, Fridge, Fridge, Fridge, Fridge, Fridge, Fridge, Fridge],orderId:Order1234, date:2026-04-01T20:57}";
        assertEquals(expected, order1.toString());
        assertEquals(20000, order1.getTotalPrice(), 0.001);

        List<Product> productList1 = new ArrayList<>();
        productList1.add(product1);
        String expected1 = "Invalid order: Customer must be provided AND the product list must contain exactly 10 items.";
        try {
            Order order2 = new Order("Order12345", LocalDateTime.now(), null, productList1);
        } catch (IllegalArgumentException e) {
            assertEquals(expected1, e.getMessage());
        }

    }
}
