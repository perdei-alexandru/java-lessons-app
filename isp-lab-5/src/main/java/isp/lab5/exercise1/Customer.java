package isp.lab5.exercise1;

public class Customer {
    private String customerId;
    private String name;
    private String phone;
    Address address;

    public Customer(String customerId, String name, String phone, Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Customer must have an address");
        }
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }
}
