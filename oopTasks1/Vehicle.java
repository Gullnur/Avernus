package oopTasks;

public class Vehicle {
    private String brand;
    private int speed;


    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed= speed;
    }

    public void checkDetails() {
        System.out.println("Brand:"  + brand);
        System.out.println("SpeeD:"+ speed);
    }

}
