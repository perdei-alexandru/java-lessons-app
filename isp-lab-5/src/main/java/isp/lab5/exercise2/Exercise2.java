package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Chargeable smartWatch = new SmartWatch();
        Chargeable smartPhone = new SmartPhone();
        Chargeable laptop = new Laptop();
        smartWatch.charge(10);
        smartPhone.charge(10);
        laptop.charge(10);


    }
}
