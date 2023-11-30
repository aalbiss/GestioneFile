import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetturaSupermercato {

    public static void main(String[] args) {

        String nomeFile = "Supermercato.csv";

        try {
            FileInputStream fin = new FileInputStream(nomeFile);

            Scanner in = new Scanner(fin);
            String linea;
            while (in.hasNextLine()){

                linea = in.nextLine();

                String elementi[] =  linea.split(";");

                String descrizione = elementi[0];
                String peso = elementi[1];
                String prezzo = elementi[2];

                System.out.print("Descrzione= " + descrizione);
                System.out.print(", peso= " + peso);
                System.out.print(", prezzo= " + prezzo);

                System.out.println();

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }

}
