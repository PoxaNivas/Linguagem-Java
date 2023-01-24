/*
 * 5.Faça um programa que tenha um método que recebe um vetor de números inteiros digitados pelo usuário. Esse método terá que ordenar o vetor em ordem crescente. Dica: procure na Internet por algoritmos de ordenaçãodiferente do Bubblesort!
 */
import java.util.Scanner;
import java.util.Arrays;

public class Lista8_ex5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] vetor= new int[9];
        for(int a=0;a<vetor.length;a++){
            System.out.println("Por favor, digite um valor :");
            vetor[a]=input.nextInt();
        }
        ordena(vetor);
        input.close();

    }
    public static void ordena(int []v){
        int []ve= v;
        Arrays.sort(ve);
        System.out.println(Arrays.toString(ve));
    }
     
}

   