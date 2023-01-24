package Novos;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*Do executa bloco de códigos pelo menos uma vez, já While executa a primeira vez somente se os parametros forem verdadeiros. Então analisa se continua sendo verdadeiro para executar a segunda vez. */
        int i=0;
        System.out.println("Seja bem-vindo a cafeteria");   
        System.out.println("digite um número");
        int opcao = input.nextInt();
        do{
            System.out.println("Mais uma vez");   
            System.out.println("digite um número");
            opcao=input.nextInt();
        }while(opcao<10);
        System.out.println("Fim do programa");

        }

    }
