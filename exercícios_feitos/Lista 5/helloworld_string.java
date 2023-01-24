import java.util.Scanner;

public class helloworld_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Digite o seu nome: ");
        java.lang.String palavra = input.nextLine();
        System.out.println("Hello World, "+palavra);
        System.out.println("O nome digitado tem "+ palavra.length()+" caracteres");
        System.out.println("\n");
        input.close();
    }
}
