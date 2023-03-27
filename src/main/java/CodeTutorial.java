import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class CodeTutorial {

    public static StringBuilder fillTheLoop (String[] args) {
       try {
        PrintWriter out = new PrintWriter("filename.txt");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            stringBuilder.append(args[i]);
            stringBuilder.append(" is index: " + i + " \n"); 
            out.println(args[i]);
        
        }
        out.flush();
        out.close();
        System.out.println(stringBuilder.toString());
        return stringBuilder;
        } catch (FileNotFoundException e) {
           return new StringBuilder().append("ERROR: " + e.getMessage());
        }
        
    }


    public static void main(String[] args) {

        System.out.println("This is the first element:");
        System.out.println(args[0]);
        Vehicle bestCar = new Car(1997, "corolla");
        Vehicle shittyCar = new Boat(1859, "Sea Myst");
        StringBuilder result = CodeTutorial.fillTheLoop(args);
        System.out.println(result.toString());
        Vehicle[] test = new Vehicle[2];
        test[0] = bestCar;
        test[1] = shittyCar;

        for (int i = 0; i < test.length; i++ ) {
            test[i].printData();
            System.out.println(test[i].getYear());
        }
         System.out.println("Im Done!");
    }  
}
