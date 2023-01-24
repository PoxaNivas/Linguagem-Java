import java.util.Scanner;

public class Lista5_ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in,"CP850");
        
        System.out.println("\n");
        System.out.println("Por favor, digite uma frase ");
        String palavra = input.nextLine();
        System.out.println("Por favor, digite uma letra");
        char letra = input.next().charAt(0);
        input.close();

            for(int i=0;i<palavra.length();i++){
                if (letra == palavra.charAt(i)){
                    System.out.println("'"+letra+"'"+ "pode ser encontrada na posição: "+i);
                }

            }
    }
}
