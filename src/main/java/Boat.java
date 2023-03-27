public class Boat implements Vehicle {

    int year;
    String name;

    public Boat(int year, String name)
     {
        this.year = year;
        this.name = name;
     }

     
    @Override
    public void printData() {
       System.out.println("Ahoy matey this here is: " + name +" from " + year );
    }


    @Override
    public int getYear() {
        return this.year;
    }
    
}
