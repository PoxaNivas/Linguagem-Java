/*
 * 1. Faça um programa que leia um valor inteiro e que tenha um método que verifique e mostre
se o número é par, ímpar ou nulo (igual a zero). Método sem retorno.
 */

import java.util.Scanner;

public class Lista7_ex1 {
    public static void main (String[]args){
    
        par_impar();
    }

    public static void par_impar(){
        Scanner input= new Scanner(System.in);
        int numero;
        System.out.println("Por favor, digite um número: ");
        numero=input.nextInt();
        input.close();
        if(numero==0){
            System.out.println("O número é nulo");
        }
        else{
            if(numero%2==0){
                System.out.println("O número é par");
            }
            else{
                System.out.println("O número é impar");
        }
    }



    }
}
