import java.util.Scanner;

public class Lista5_ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Digite seu nome completo: ");
        String nome = input.nextLine();
        char espaco = ' ';
        int espacoB= 0,Sinicio=0,Sfinal=nome.length();
        input.close();
        for ( int i=0;i<nome.length();i++){
            char temp = nome.charAt(i);
            if (temp ==espaco){
                espacoB= espacoB + 1;
                Sinicio= i;

            }
        }
        String sobrenome = nome.substring(Sinicio,Sfinal);
        System.out.println("Sobrenome: "+ sobrenome);
    }
}
