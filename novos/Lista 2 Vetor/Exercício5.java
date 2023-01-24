package Novos;

import java.util.Arrays;
import java.util.Scanner;
public class Exercício5 {
    public static void main(String[]args){
        System.out.println("Seja bem-vindo(a) ao Exercício 5 da Lista 2");
        Scanner input = new Scanner (System.in);
        int vetor1[]= new int [5];
        int vetorCopia[]= new int [vetor1.length];
        for(int i=0;i<5;i++){
            System.out.println("Por favor, digite o "+(i+1)+" número: ");
            vetor1[i]=input.nextInt();
        }
        for(int i=0;i<2;i++){
            vetorCopia[i] =vetor1[i];
            vetor1[i]=vetor1[4-i];
            vetor1[4-i]=vetorCopia[i];
        }
        System.out.println(Arrays.toString(vetor1));
        input.close();
    }

}