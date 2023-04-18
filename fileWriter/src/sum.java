import java.io.FileWriter;
import java.io.IOException;

public class sum {

    public static void main(String[] args) {
    int sum=0;

        for(String a : args){
        try {
                sum=Integer.parseInt(a)+sum;
            System.out.println("Argument erfolgreich");
        }
        catch (NumberFormatException e) {
            // do nothing, ignore non-integer arguments
            System.out.println("Keine Zahl");
        }
        }

        try(FileWriter fileWriter = new FileWriter("sum.txt")){
            fileWriter.write("Die Summe der Argumente ist: " + sum);
            System.out.println("Summe:" + sum);
            System.out.println("Erfolgreich!");
            fileWriter.close();
        }

        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fehler!");
        }
    }
}


