import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeTutorial {
    public static void main(String[] args) {

        System.out.println("This is the first element:");
        System.out.println(args[0]);
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            stringBuilder.append(args[i]);
            stringBuilder.append(" is index: " + i + " \n");
        }

        System.out.println(stringBuilder.toString());
        System.out.println("Im Done!");
    }
}
