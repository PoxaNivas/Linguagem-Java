import java.util.Scanner;

public class Lista5_ex1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("Por favor, digite uma frase: ");
    java.lang.String frase = input.nextLine();
    
    System.out.println("A frase digitada tem "+frase.length()+ " caracteres (Cálculo pode conter espaços em branco)\n ");
    input.close();
    }
}
