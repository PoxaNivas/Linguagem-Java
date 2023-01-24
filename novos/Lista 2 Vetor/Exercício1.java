package Novos;

public class Exercício1 {
    public static void main(String[] args) {
        
        int somatotal =0,media=0;
    System.out.println("Seja bem-vindo(a) ao Exercício 1 da Lista 2");
        int vetor1[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
            for (int i=0;i<15;i++){
                somatotal= somatotal+vetor1[i];
            }
            media=somatotal/15;
            System.out.println("a soma dos valores no vetor é "+ somatotal);
            System.out.println("a média dos valores no vetor é "+ media);
    }
}