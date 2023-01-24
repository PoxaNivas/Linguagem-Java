/*
 * 3.Faça um programa que tenha um método que receba uma matriz. Nesse método teremos que mostrar a soma da diagonal principal e a soma de cada linha.
 */

import java.util.Scanner;

public class Lista8_ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] numeros = new float[3][3];
        float[] linhas = new float[numeros.length];

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite um número");
                numeros[l][c] = input.nextFloat();
            }
        }

        Soma(numeros,linhas);
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("["+ numeros[l][c]+"]");
                 
            }
            System.out.println();
        }
        input.close();

    }

    public static void Soma(float[][] num,float lin[]) {
        float soma = 0;
        for (int l = 0; l < num.length; l++) {
            for (int c = 0; c < num.length; c++) {
                lin[l]=lin[l]+num[l][c];
                if (l == c) {
                    soma += num[l][c];
                }
            }
        }
        System.out.println("O resultado da soma da diagonal principal é " + soma);
        for(int a=0;a<lin.length;a++){
            System.out.println("a soma da "+(a+1)+" é "+ lin[a]);
        }
    }
}
// pode ser com retorno e sem retorno
// soma diagonal n+n
