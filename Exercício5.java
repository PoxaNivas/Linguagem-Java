package Novos;

import java.util.Arrays;

public class Exercício5 {
    public static void main(String[]args){
        int vetor1[]= {1,2,3,4,5};
        int vetorCopia[]= new int [vetor1.length];
        for(int i=0;i<2;i++){
            vetorCopia[i] =vetor1[i];
            vetor1[i]=vetor1[4-i];
            vetor1[4-i]=vetorCopia[i];
        }
        System.out.println(Arrays.toString(vetor1));

    }

}