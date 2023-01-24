package Novos;
import java.util.Random;

public class Exercício6 {
    public static void main(String[] args){
        Random gerador = new Random();
        int mat[][]=new int[3][3], lin[]={0, 0, 0}, col[]={0, 0, 0}, pri=0, sec=0;

        System.out.println("\033\143");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat[i][j]=gerador.nextInt(100);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                col[j]+=mat[i][j];
                lin[i]+=mat[i][j];
                if(i==j){
                pri+=mat[i][j];
                }
            }
        }

        for(int i=0; i<3; i++){
            for(int j=2; j>=0; j--){
                sec+=mat[i][j];
                i++;
            }
        }
        System.out.println("\033\143");

        for (int i = 0; i < 3; i++) {
            System.out.print("\n\t\t| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(String.format("%02d", mat[i][j]));
                if (j < 2) {
                    System.out.print(", ");
                } else {
                    System.out.print(" |");
                }
            }
        }

        System.out.println("\n\nSoma dos elementos da diagonal primaria:   "+pri);
        System.out.println("Soma dos elementos da diagonal secundaria: "+sec);
        System.out.println("\nSoma dos elementos das linhas:");
        System.out.println("Linha 1: "+lin[0]+"\tLinha 2: "+lin[1]+"\tLinha 3: "+lin[2]);
        System.out.println("\nSoma dos elementos das colunas:");
        System.out.println("Coluna 1: "+col[0]+"\tColuna 2: "+col[1]+"\tColuna 3: "+col[2]+"\n");
    }
}
