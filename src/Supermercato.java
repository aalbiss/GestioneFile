import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Supermercato {

    public static void main(String[] args) {

        String nomeFile = "Supermercato.csv";

        try {
            FileWriter fw = new FileWriter(nomeFile);
            PrintWriter pw = new PrintWriter(fw);

            System.out.println("Inizio a scrivere...");

            pw.print("Spaghetti" + ";");
            pw.print("500" + ";");
            pw.println("0,95" );

            pw.print("Pelati" + ";");
            pw.print("400" + ";");
            pw.println("1,25" );

            pw.print("Pane" + ";");
            pw.print("700" + ";");
            pw.println("15" );

            pw.print("Marmellata" + ";");
            pw.print("350" + ";");
            pw.println("2,70" );

            System.out.println("...finito");

            fw.close();
            pw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
