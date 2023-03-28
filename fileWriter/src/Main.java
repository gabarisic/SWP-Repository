import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String text = "Heute ist ein guter Tag";
        try(FileWriter fileWriter = new FileWriter("text.txt" )) {
            fileWriter.write(text);

            System.out.println("Erfolgreich!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fehler!"
            );
        }
    }
}

