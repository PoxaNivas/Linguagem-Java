package Novos;

import java.util.Scanner;
import java.util.Arrays;

public class Exercício6 {
    public static void main (String[]args){
        System.out.println("Seja bem-vindo(a) ao Exercício 1 da Lista 3");
        Scanner input= new Scanner(System.in);
        double vetor1[]= new double[3], vetor2[]= new double[3], vetor3[]= new double[6];
        double soma1=0,soma2=0;
        for (int i=0;i<3;i++){
            System.out.println("Por favor, digite o "+(i+1)+"º valor para o primeiro vetor");
            vetor1[i]= input.nextDouble();
            soma1= soma1+ vetor1[i];
        }
        
        for (int i=0;i<3;i++){
            System.out.println("Por favor, digite o "+(i+1)+"º valor para o segundo vetor");
            vetor2[i]= input.nextDouble();
            soma2= soma2+ vetor2[i];
        }
        
        if(soma1>soma2){
            System.arraycopy(vetor1,0,vetor3,0,3);
            System.arraycopy(vetor2,0,vetor3,3,3);
            System.out.println(Arrays.toString(vetor3));
            System.out.println("A soma do primeiro vetor é "+soma1+" enquanto a soma do segundo vetor é "+soma2+"\n");


        }
        else{
            System.arraycopy(vetor2,0,vetor3,0,3);
            System.arraycopy(vetor1,0,vetor3,3,3);
            System.out.println(Arrays.toString(vetor3));
            System.out.println("A soma do segundo vetor é "+soma2+" enquanto a soma do primeiro vetor é "+soma1+"\n");

        }


    }
}
