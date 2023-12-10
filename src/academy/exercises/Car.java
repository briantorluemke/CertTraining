package academy.exercises;

public class Car {
    // Attributes
    String make;
    String model;
    int year;
    int miles;

    // Constructor
    public Car(String make, String model, int year, int miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
    }

    // Methods
    public void drive(int miles) {
        this.miles += miles;
    }

    public void sayCar() {
        System.out.println(this.make + " " + this.model);
    }

    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 1999, 10000);
        car.sayCar();
        car.drive(101);
        System.out.println(car.miles);
    }
}
