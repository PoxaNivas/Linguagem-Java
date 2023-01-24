
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lista10_ex1{
  public static void main(String[]args) throws IOException{

    ArrayList <String> nomes= new ArrayList<>();
    char separa=',';
   
    //Este bloco cria fluxo de entrada com arquivo, mas, infelizmente, ainda é em binário
    FileInputStream fis = new FileInputStream("D:/Documentos/Projetos/Projetos em java/alunos1.txt");
    //Este bloco Le o fluxo de dados do input em caracteres,em char
    InputStreamReader isr = new InputStreamReader(fis);
    //Este bloco inicia o conversor de char para string utilização do buffer Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
    BufferedReader br = new BufferedReader(isr);
    //Este bloco pega o conversor recem criado e utiliza o método readLine para fazer leituras em linhas de char para strings
    String linha = br.readLine();

    
    while (linha != null){
      
      linha = br.readLine();
      System.out.println(linha);
    }

    br.close();

  }

}