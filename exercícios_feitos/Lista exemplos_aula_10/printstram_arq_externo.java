import java.io.FileNotFoundException;
import java.io.PrintStream;

public class printstram_arq_externo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream escreve = new PrintStream("numeros.txt");
        escreve.println("Hello world");
        escreve.close();

    }
}
