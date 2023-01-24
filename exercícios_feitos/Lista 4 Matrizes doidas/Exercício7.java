package Novos;
import java.util.Scanner;
import java.util.Random;

public class Exercício7 {
   public static void main(String[] args) {
    Random aleatorio = new Random();
    Scanner input = new Scanner(System.in); 
        int vetor[][] = new int[3][3]; 
        int linha=0,coluna=0;
    
            for( linha=0;linha<3;linha++){ 
                for (coluna=0;coluna<3;coluna++){ 
                System.out.println("Por favor, digite um número");
                vetor[linha][coluna]=input.nextInt();
                } 
            }
            System.out.println("Você digitou a seguinte matriz: ");
            for( linha=0;linha<3;linha++){ 
                for (coluna=0;coluna<3;coluna++){ 
                System.out.print("["+vetor[linha][coluna]+"]");
                }
                System.out.print("\n");
            }     
            System.out.println("mas eu girei 90º e ficou assim: ");
           
            for( linha=0;linha<3;linha++){ 
                for ( coluna=3-1;coluna>=0;coluna--){ 
                System.out.print("["+vetor[coluna][linha]+"]"); 
                } 
                System.out.print("\n");
            }
        }
    }
