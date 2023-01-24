package Novos;
import java.util.Scanner;
import java.util.Random;

public class Exercício8 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner input = new Scanner(System.in);
        int vetorA[][]=new int[4][4], vetorB[][]=new int[4][4], vetorC[][]=new int[4][4];
        int A=0,B=0;
        int linha=0,coluna=0,soma=0;
        for(linha=0;linha<4;linha++){
            for(coluna=0;coluna<4;coluna++){
            A= aleatorio.nextInt(100);
            vetorA[linha][coluna]=A;
            B= aleatorio.nextInt(100);
            vetorB[linha][coluna]=B;
            vetorC[linha][coluna]= vetorA[linha][coluna]+vetorB[linha][coluna];
            soma= soma+vetorC[linha][coluna];
            }
        }

        System.out.println("A matriz A  ficou desta forma: ");
        for(linha=0;linha<4;linha++){
            for(coluna=0;coluna<4;coluna++){
                System.out.print("["+vetorA[linha][coluna]+"]");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        System.out.println("A matriz B ficou desta forma: ");
        for(linha=0;linha<4;linha++){
            for(coluna=0;coluna<4;coluna++){
                
                System.out.print("["+vetorB[linha][coluna]+"]");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        System.out.println("A matriz C (Soma da matriz A+B) ficou desta forma: ");
        for(linha=0;linha<4;linha++){
            for(coluna=0;coluna<4;coluna++){
                
                System.out.print("["+vetorC[linha][coluna]+"]");
            }
            System.out.print("\n");
        }
    System.out.println("\n");
    System.out.println("A soma dos elementos é "+soma);
    System.out.println("\n");

    }
}
