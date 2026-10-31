package isp.lab3.example;

public class CarRunner {
    public static void main(String[] args) {
        Car car2=new Car(300,"rosu");
        Car car=new Car(300,"rosu");
        System.out.println("Car si car1 sunt aceleasi:" + car.equals(car2));
Car car3=new Car();
car3.setSpeed(100);
car3.setColour("alb");
        System.out.println("Car3: speed " + car3.getSpeed() + " colour:" + car3.getColour());
        System.out.println("Static field:" + Car.whell);

    }
}
