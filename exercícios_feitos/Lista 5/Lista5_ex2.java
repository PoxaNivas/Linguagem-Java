import java.util.Scanner;

public class Lista5_ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n"); 
        System.out.println("Por favor, digite o seu nome: "); 
        java.lang.String nome = input.nextLine();
            for(int i=0;i<nome.length();i++){
                System.out.println(nome.charAt(i));
        }
        System.out.println("\n"); 
        input.close();     
    }
}
