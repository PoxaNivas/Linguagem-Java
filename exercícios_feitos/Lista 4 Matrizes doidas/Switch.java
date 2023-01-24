package Novos;
import java.util.Scanner;
public class Switch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) a Cafeteria Zaviland");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Café expresso");
        System.out.println("2 - Cappuccino");
        System.out.println("3 - Macchiato");
       
        int pedido= input.nextInt();
        switch(pedido){
            /*Se quisessemos usar letras ao invés de números bastaria usar aspas simples 'a','b' ou 'c' */
            case 1:
                System.out.println("Café expresso escolhido\n");
                break;
            case 2:
                System.out.println("Cappuccino escolhido\n");
                break;
            case 3:
                System.out.println("Macchiato escolhido\n");
                break;
            default:
                System.out.println("Opção inválida\n");
        }
    }
    
}
