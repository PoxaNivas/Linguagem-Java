import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class leitura_arq_externo {
    public static void main(String[] args) {
        // esse code cria um caminho
        Path caminho = Paths.get("D:/Documentos/Projetos/Projetos em java/alunos1.txt");
        // esse code abre um diretório, podendo gerar exceções, por isso, precisa do try
        // catch
        // Files.readAllBytes(caminho);
        // ao utilizarmos byte [] estamos armazenando os bytes lidos dentro do vetor
        // Files.readAllBytes(caminho);

        try {
            byte[] texto = Files.readAllBytes(caminho);
            // devemos criar um objeto do tipo string para conseguirmos visualizar
            String leitura = new String(texto);

            // este bloco exibe um pop com a variável
             JOptionPane.showMessageDialog( null, leitura);

        } catch (Exception erro) {

        }

    }
}