import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.*;


public class escrita_arq_externo {
    public static void main(String[] args) {
        Path caminho = Paths.get("D:/Documentos/Projetos/Projetos em java/test.txt");
        String texto = "Hello world,bitch";
        //antes de transferir o texto para o arquivo precisamos converter para bytes, para isso, poodemos criar um vetor 
        byte[] textoEmByte = texto.getBytes();//essa função está pegando os bytes da variável texto
        //pode gerar exceções, por isso, precisa do try catch
        try{
            Files.write(caminho,textoEmByte);
        }catch(Exception input){

        }
        
    }
}
