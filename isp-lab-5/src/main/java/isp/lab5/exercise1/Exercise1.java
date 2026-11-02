package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
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
        Order order1 = new Order("Order1234", LocalDateTime.now(), customer1, productList);
        System.out.println(order1.toString());

        List<Product> productList1 = new ArrayList<>();
        productList1.add(product1);
        Order order2 = new Order("Order12345", LocalDateTime.now(), null, productList1);

    }
}
