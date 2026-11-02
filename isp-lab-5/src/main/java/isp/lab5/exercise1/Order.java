package isp.lab5.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private static final int NUMBER_OF_PRODUCTS = 10;
    private String orderId;
    private LocalDateTime date;
    private double totalPrice;
    private Customer customer;
    private final List<Product> products;

    public Order(String orderId, LocalDateTime date, Customer customer, List<Product> productList) {
        if (customer == null || productList == null || productList.size() != NUMBER_OF_PRODUCTS) {
            throw new IllegalArgumentException("Invalid order: Customer must be provided AND the product list must contain exactly " + NUMBER_OF_PRODUCTS + " items.");
        }
        this.orderId = orderId;
        this.date = date;
        this.totalPrice = 0.0;
        this.customer = customer;
        this.products = new ArrayList<>(productList);
        for (Product p : products)
            this.totalPrice += p.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            sb.append(products.get(i).getName());
            if (i < products.size() - 1) {
                sb.append(", ");
            }
        }

        return "Order{customer=" + customer.getName() + ", products=[" + sb.toString() + "]," + "orderId:" + orderId + ", date:" + date + "}";
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}


