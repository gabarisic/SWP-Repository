import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        for(String a : args){
            System.out.println(a);
        }
        try(FileWriter fileWriter = new FileWriter(args[0] )) {

            fileWriter.write(args[1]);
            System.out.println("Erfolgreich!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fehler!"
            );
        }
    }
}

