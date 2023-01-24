package Novos;
import java.util.Scanner;

public class Exercício3 {
    public static void main(String[]args){
    Scanner input= new Scanner (System.in);
    float vetor[][]= new float [2][4];
    float valor_par= 0;
    float media_par=0;
    
        for(int linha=0;linha<2;linha++){
            for(int coluna=0;coluna<4;coluna++){
                System.out.println("Por favor, digite o "+(coluna+1)+ " número da linha "+(linha+1));
                vetor[linha][coluna]= input.nextFloat();
                
                if(vetor[linha][coluna]% 2 ==0){
                    valor_par=valor_par+1;
                    media_par=media_par+vetor[linha][coluna];
                }
            }
        }
        media_par=media_par/8;
        System.out.println("O total de números pares é: "+valor_par);
        System.out.println("a média de elementos pares é: "+media_par);

    }
}
