/*
 * Faça um programa que receba um número indeterminado de valores que 
serão inseridos pelo usuário e irão preencher um vetor dinâmico, perguntando 
se deve fazer uma nova inserção ou de deve encerrar. Quando encerrado a 
inserção, deverá ser exibido a soma e a média dos valores inseridos.

 */


import java.util.Scanner;
import java.util.ArrayList;

public class Lista6_ex1 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double valor,temp,get=0;
        char resposta;

        System.out.println("\n");
        System.out.println("Seja bem-vindo(a) ao organizador de números");

        do{
            System.out.println("Por favor, digite um número: ");
            valor= input.nextDouble();
            numeros.add(valor);
            System.out.println("Por favor, digite um número: ");
            valor= input.nextDouble();
            numeros.add(valor);
            System.out.println("Deseja continuar? S/N ");
            resposta= input.next().charAt(0);

        }while(resposta == 's');
        input.close();
        for (int i=0;i<numeros.size();i++){
            get= get + numeros.get(i);

        }
        temp= get/numeros.size();
        System.out.println("A soma dos números digitados é: "+get);
        System.out.println("A média dos números digitados é: "+temp);

    }
}
