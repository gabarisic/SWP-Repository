import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       ArrayList<Helden> inputHelden = new ArrayList<Helden>();
        ArrayList<Tank> inputTank = new ArrayList<Tank>();
        ArrayList<Magier> inputMagier = new ArrayList<Magier>();

        Tank seraphin= new Tank(3,400,80);
        Tank otto= new Tank(50,300,200);

        Magier ultis= new Magier(999,6000,900);
        Magier walter= new Magier(10000,40000,80000);

        inputTank.add(seraphin);
        inputTank.add(otto);

        inputMagier.add(walter);
        inputMagier.add(ultis);

        inputHelden.add(seraphin);
        inputHelden.add(otto);
        inputHelden.add(ultis);
        inputHelden.add(walter);

        System.out.println(inputHelden);
        MagierManapkt(inputMagier);
    }


    public static void MagierManapkt(ArrayList<Magier> mana){
        for (Magier m : mana){
            if (m instanceof Magier){
                Magier d = (Magier) m;
                System.out.println("Wie viel Mana hat der Magier:"+d.getManapunkte());

            }
            else{
                System.out.println("Keine Manapunkte");
            }

        }

    }
}
