package Novos;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[]args){
    Scanner input =new Scanner(System.in);
    System.out.println("Seja bem-vindo(a) ao Exercício 3 da Lista 2");
    int vetor1[]=new int[5];
    int vetor2[]=new int[5];
    int vetor3[]=new int[5];
        for(int i=0;i<5;i++){
        System.out.println("Por favor, digite "+(i+1)+" número: ");
        vetor1[i]= input.nextInt();
        }
    
        for(int i=0;i<5;i++){
        System.out.println("Por favor, digite "+(i+1)+" número da segunda matriz: ");
        vetor2[i]= input.nextInt();
        }
    
        for(int i=0;i<5;i++){
            vetor3[i]= vetor1[i]+vetor2[i];
            System.out.println("O resultado dos números digitados é "+(i+1)+" º "+vetor3[i]);
        }
        input.close();

    }
}
