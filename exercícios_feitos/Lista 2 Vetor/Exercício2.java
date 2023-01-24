package Novos;
import java.util.Scanner;
public class Exercício2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) ao Exercício 2 da Lista 2");
        System.out.println("Digite a quantidade do vetor: ");
        int qvetor = input.nextInt();
        int valorpar =0,valorimpar=0;
        int vetor1[]= new int [qvetor];
        int ndigitado=0;
            for (int i=0;i<qvetor;i++){
                System.out.println("Digite um número"+i+ " º inteiro: ");
                vetor1[i] = input.nextInt();
                ndigitado = vetor1[i]%2;
                if(ndigitado ==0){
                valorpar=valorpar+1;}
                else{
                valorimpar=valorimpar+1;}
                }

            System.out.println("a quantidade de pares no vetor é "+ valorpar);
            System.out.println("a quantidade de impares no vetor é "+ valorimpar);
            input.close();
    }    
}
