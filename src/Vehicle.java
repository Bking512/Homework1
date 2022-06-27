public class Vehicle {

    int year;
    String make;
    String model;

    public Vehicle(int year, String make, String model)
    {
        this.year = year;
        this.make = make;
        this.model = model;

    }
    public void carStats()
    {
        System.out.println("make: " + this.make);
        System.out.println("year: " + this.year);
        System.out.println("year: " + this.model);
    }
}
