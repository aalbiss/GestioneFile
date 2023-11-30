import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ScritturaFile {
    public static void main(String[] args) {

        String nomeFile = "NomeFile.txt";

        try {
            FileWriter fw = new FileWriter(nomeFile);

            PrintWriter pw = new PrintWriter(fw);

            System.out.println("Inizio a scrivere...");
            pw.println("Ciao mondo");
            pw.println(12);
            pw.print(33);
            System.out.println("...finito");

            pw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("Eccezione " + e);
        }

    }
}