
public class Car implements Vehicle {
    String model;
    int year; 

    public Car(int year, String model) {
        this.model = model;
        this.year = year;
    }

    public void printData()
    {
        System.out.println("This is a " + this.model + " from: " + this.year);
    }

    @Override
    public int getYear() {
        return this.year;
    }
}
