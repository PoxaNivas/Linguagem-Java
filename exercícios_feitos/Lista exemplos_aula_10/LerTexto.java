import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LerTexto {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList();
        ArrayList<String> strings = new ArrayList();
        // variavel para armazenar os valores da iteracao
        String proximo = null;
        try {
            File arquivo = new File("alunos1.txt");
            InputStream input = new FileInputStream(arquivo);
            Scanner s = new Scanner(arquivo);

            // definindo o padrao para tokenizar, no caso eh um caracter de nova linha
            s.useDelimiter("\\n");
            while (s.hasNext()) {
                proximo = s.next();
                try {
                    // transformando para um interio, caso contrario assumiremos que eh uma string
                    inteiros.add(Integer.parseInt(proximo));
                } catch (NumberFormatException nf) {
                    strings.add(proximo);
                }

            }

            // liberando o arquivo
            s.close();

            // testando o conjunto dos interios
            for (int i : inteiros)
                System.out.println("imprimindo os inteiros: " + i);

            for (String z : strings)
                System.out.println("imprimindo as strings: " + z);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(strings);
        System.out.println(inteiros);

    }
}