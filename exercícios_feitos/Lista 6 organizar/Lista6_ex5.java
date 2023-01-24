/*
 * 5. Faça um programa que pergunte ao usuário quantos elementos ele quer 
visualizar da sequência de Fibonacci. Os números dessa sequência deverão ser 
calculados e armazenados em um vetor dinâmico. Também deverá ser exibido 
em tela os números da sequência. Exemplo:
Digite a quantidade de elementos para a sequência: 12
Sequência de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
 */

import java.util.Scanner;
import java.util.ArrayList;


public class Lista6_ex5 {
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        ArrayList <Integer> VFibonacci = new ArrayList<>();
        int n1=0,n2=1,temp=0,res;

        System.out.println("\n");
        System.out.println("Digite a quantidade de elementos para a sequência: ");
        res= input.nextInt();
        input.close();

        for(int c=0;c<res;c++){
            VFibonacci.add(n2);
            temp=n2;
            n2=n2+n1;
            n1=temp;
        }

        System.out.println(VFibonacci);
    }
}
