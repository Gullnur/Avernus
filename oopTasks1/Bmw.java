package oopTasks;

public class Bmw {
    private Vehicle details;
    private String model;

    public Bmw(String brand, int speed, String model){


        //  details obyektini yaradiriq ona otururuk burda

        this.details = new Vehicle(brand, speed);
        this.model = model;

    }
    public void startCar() {
        details.checkDetails();
        System.out.println("Model: " + model);
    }


}
