package isp.lab3.exercise3;

public class MainOfExercise3 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 100, 'B');
        Vehicle vehicle2 = new Vehicle("Lambourghini", "Huracan", 300, 'D');
        System.out.println("Vehicle1:");
        System.out.println("Model:" + vehicle1.getModel() + " type:" + vehicle1.getType() + " speed:" + vehicle1.getSpeed() + " fuelType:" + vehicle1.getFuelType());
        vehicle1.setModel("Toyota");
        vehicle1.setType("RAV4");
        vehicle1.setSpeed(130);
        vehicle1.setFuelType('D');
        System.out.println(vehicle1.toString());


        System.out.println("\nVehicle2:");
        System.out.println("Model:" + vehicle2.getModel() + " type:" + vehicle2.getType() + " speed:" + vehicle2.getSpeed() + " fuelType:" + vehicle2.getFuelType());
        vehicle2.setModel("Toyota");
        vehicle2.setType("RAV4");
        vehicle2.setSpeed(130);
        vehicle2.setFuelType('D');
        System.out.println(vehicle2.toString());
        System.out.println("Vehicle1 este egal cu vehicle2:" + vehicle1.equals(vehicle2));
        Vehicle.numberOfVehicles();
        Vehicle vehicle3 = new Vehicle("Dacia", "Duster", 50, 'D');
        Vehicle.numberOfVehicles();
    }


}
