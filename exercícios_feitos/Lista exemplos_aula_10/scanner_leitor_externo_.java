
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class scanner_leitor_externo_ {
    public static void main(String[] args) {

        // Este bloco cria fluxo de entrada com arquivo, mas, infelizmente, ainda é em
        // binário
        try {
            Scanner leitor = new Scanner(new File("D:/Documentos/Projetos/Projetos em java/alunos1.txt"));
            // Este bloco Le o fluxo de dados do input em caracteres,em char
            while (leitor.hasNextLine()) {

                System.out.println(leitor.nextLine());
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado");
        }

    }

}