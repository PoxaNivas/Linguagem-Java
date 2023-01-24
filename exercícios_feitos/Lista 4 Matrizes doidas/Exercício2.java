package Novos;
import java.util.Scanner;
public class Exercício2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in); 
        System.out.println("Lista 3x3 com entradas por colunas"); 
        int vetor[][] = new int[3][3]; 
    
            for (int coluna=0;coluna<3;coluna++){ 
                for(int linha=0;linha<3;linha++){ 
                System.out.println("Por favor, digite o "+(coluna+1)+" º número da coluna"+(linha+1)); 
                vetor[coluna][linha]=input.nextInt(); 
                } 
            }      
    
            for (int coluna=0;coluna<3;coluna++){ 
                for(int linha=0;linha<3;linha++){ 
                System.out.print("["+vetor[linha][coluna]+"]"); 
                } 
                System.out.print("\n");
        }
    }
}