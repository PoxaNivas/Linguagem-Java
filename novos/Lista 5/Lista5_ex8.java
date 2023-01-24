import java.util.Scanner;

public class Lista5_ex8 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in,"CP850");
        
        System.out.println("\n");
        System.out.println("Por favor, digite o nome da disciplina sem caracteres especiais(ex:ã,é,etc.) ");
        String frase = input.nextLine();
        input.close();
        
        String disciplina = frase.toLowerCase();
        boolean comeca = disciplina.startsWith("programação");
        boolean termina = disciplina.endsWith("programação");

            if (comeca == true || termina== true){
                System.out.println("Disciplina pertence a categoria programação");
                System.out.println("\n");
            }
            else{
                System.out.println("Não pertence a categoria programação");
                System.out.println("\n");
            }

    }
}
