import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {     
        Scanner entrada = new Scanner(System.in, "latin1");
        String conteudo;
        System.out.println("------------------------------------------");
        System.out.println("-------------Gravador de notas------------");
        System.out.println("------------------------------------------");
        System.out.println("Para adicionar um novo aluno digite RA,nome e as três notas separando por '-'");
        System.out.println("Exemplo: 0001-Nivaldo-10-9-10");

        conteudo = entrada.nextLine();
        String nome, n1, n2, n3, ra;
        double media, mediaG = 0, maiorM = 0, menorM = 10;
        int quantAluno = 0;
        try {
            File file = new File("teste.txt");
            if (!file.exists()) {
                System.out.println("------------------------------------------");
                System.out.println("O arquivo não existia, mas foi criado ");
                file.createNewFile();
                System.out.println("------------------------------------------");
                System.out.println("\n");
            } 
            FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(conteudo);
            bw.newLine();
            bw.close();
                FileReader ler = new FileReader("teste.txt");
                BufferedReader reader = new BufferedReader(ler);
                String linha;
                String dados[];
                while ((linha = reader.readLine()) != null) {
                    dados = linha.split("\\-");
                    ra = dados[0];
                    nome = dados[1];
                    n1 = dados[2];
                    n2 = dados[3];
                    n3 = dados[4];
                    media = (Double.parseDouble(dados[2]) + Double.parseDouble(dados[3]) + Double.parseDouble(dados[4]))
                            / 3;
                    mediaG += media;
                    if (media > maiorM) {
                        maiorM = media;
                    } else if (media < menorM) {
                        menorM = media;
                    } else {

                    }
                    System.out.println("\n");
                    if (media >= 8.5) {
                        System.out.println("Consideração final:Excelente");
                    } else if (media >= 7 && media <= 8.5) {
                        System.out.println("Consideração final:Bom");
                    } else if (media <= 7 && media >= 5) {
                        System.out.println("Consideração final:Regular");
                    } else {
                        System.out.println("Consideração final:Preocupante");
                    }

                    System.out.print("RA: " + ra);
                    System.out.print(" - Nome: " + nome);
                    System.out.print(" - Nota: " + n1);
                    System.out.print(" - Nota: " + n2);
                    System.out.print(" - Nota: " + n3);
                    System.out.print(" - Média: " + media);
                    quantAluno += 1;
                }
                System.out.println("\n");
                System.out.println("A média geral da sala é " + mediaG / quantAluno);
                System.out.println("A maior média foi " + maiorM);
                System.out.println("A menor média foi " + menorM);
                System.out.println("O cálculo levou em consideração as notas de " + quantAluno + " alunos");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
