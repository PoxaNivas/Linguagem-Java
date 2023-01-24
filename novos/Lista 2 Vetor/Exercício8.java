package Novos;
import java.util.Scanner;
import java.util.Arrays;

public class Exercício8 {
    public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    int vetor1[]= new int[9];
    int vetorCopia[]= new int [vetor1.length];
    for(int i=0;i<9;i++){
        System.out.println("Por favor, digite o "+(i+1)+" um número: ");
        vetor1[i]=input.nextInt();
    }
    for(int i=0;i<4;i++){

    vetorCopia[i] =vetor1[i];
    vetor1[i]=vetor1[8-i];
    vetor1[8-i]=vetorCopia[i];
    }
    System.out.print(Arrays.toString(vetor1));
    }
}
