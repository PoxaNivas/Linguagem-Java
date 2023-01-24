/*
 * 2. Altere o exercício anterior para que os valores sejam organizados dentro do 
vetor em forma crescente. Dica: pesquise sobre algoritmos de ordenação, como 
bubblesort ou quicksort.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lista6_ex2 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        ArrayList <Integer> organizador = new ArrayList<>();
        int valor,valor2;
        char resposta;
            System.out.println("\n");
            System.out.println("Seja bem-vindo(a) ao organizador de números ");

            do{
                System.out.println("Por favor, digite um número");
                valor = input.nextInt();
                organizador.add(valor);
                System.out.println("Por favor, digite um número");
                valor2 = input.nextInt();
                organizador.add(valor2);
                System.out.println("Deseja acrescentar números? S/N ");
                resposta= input.next().charAt(0);
            }while(resposta =='S'|| resposta =='s');
            input.close();
            
            System.out.println("A sequência digitada foi:"+organizador);
            Collections.sort(organizador);
            System.out.println("A organização, de forma crescente, pode se apresentada desta maneira: "+organizador);

    }
}
