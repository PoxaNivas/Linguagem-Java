/*
 * 2.Faça um programa que tenha um método sem retorno que receba matriz de reais e calcule e mostre a somatória dos valores contidos na matriz.
 */

import java.util.Scanner;
public class Lista8_ex2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float [][] numeros= new float[3][3];        
            for(int l=0;l<3;l++){
                for(int c=0;c<3;c++){
                    System.out.println("Digite um número");
                    numeros[l][c]= input.nextFloat();
                }
            }
            input.close();
        Soma(numeros);
    }
    public static void Soma(float [][]num){
        float soma=0;
        for(int l=0;l<num.length;l++){
            for(int c=0;c<num.length;c++){
            soma+=num[l][c];
            }
        }
        System.out.println("O resultado da soma da matriz sem retorno é "+soma);
    }
}
