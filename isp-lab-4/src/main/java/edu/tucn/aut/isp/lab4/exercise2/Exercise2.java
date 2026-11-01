package edu.tucn.aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
FishFeeder f1=new FishFeeder("BOSCH","B1",12);
        System.out.println(f1.toString());
        f1.feed();
        f1.feed();
        f1.fillUp();
        System.out.println(f1.getMeals());
        FishFeeder f2=new FishFeeder("BOSCH","B2",100);
        System.out.println(f2.toString());






    }
}
