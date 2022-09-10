package Novos;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[]args){
    Scanner input =new Scanner(System.in);
    int vetor1[]=new int[4];
    int vetor2[]=new int[4];
    int vetor3[]=new int[4];
    for(int i=0;i<4;i++){
        System.out.println("Por favor, digite "+(i+1)+" número: ");
        vetor1[i]= input.nextInt();
        }
    
    for(int i=0;i<4;i++){
        System.out.println("Por favor, digite "+(i+1)+" número da segunda matriz: ");
        vetor2[i]= input.nextInt();
        }
    
    for(int i=0;i<4;i++){
            vetor3[i]= vetor1[i]+vetor2[i];
            System.out.println("O resultado dos números digitados é "+vetor3[i]);
            }
   
    }
}
