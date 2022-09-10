package Novos;

import java.util.Scanner;

public class Exercício6 {
    public static void main (String[]args){
        Scanner input= new Scanner(System.in);
        double vetor1[]= new double[2], vetor2[]= new double[2], vetor3[]= new double[5];
        double soma1=0,soma2=0;
        for (int i=0;i<2;i++){
            System.out.println("Por favor, digite o "+(i+1)+"º valor para o primeiro vetor");
            vetor1[i]= input.nextDouble();
            soma1= soma1+ vetor1[i];
        }
        
        for (int i=0;i<2;i++){
            System.out.println("Por favor, digite o "+(i+1)+"º valor para o segundo vetor");
            vetor2[i]= input.nextDouble();
            soma2= soma2+ vetor2[i];
        }
        



        /* 
        if(soma1>soma2){
            System.out.println(soma1);
        }
        else{
            System.out.println(soma2);
        }
        */

    }
}
