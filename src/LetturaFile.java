import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LetturaFile {

    public static void main(String[] args) {

        String nomeFile = "FileDiRighe.txt";

        try {
            FileInputStream fin = new FileInputStream(nomeFile);

            Scanner in = new Scanner(fin);
            while (in.hasNextLine()){
                String linea = in.nextLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException e){
            System.out.println("Eccezione " + e);
        }


    }

}
