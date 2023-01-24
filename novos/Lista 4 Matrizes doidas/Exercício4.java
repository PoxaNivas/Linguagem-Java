package Novos;
import java.util.Random;

public class Exercício4 {
    public static void main(String[]args){
    Random aleatorio = new Random();
    int vetor[][]= new int[3][6];
    int maior_valor=0,pos_maiorc=0,pos_maiorl=0,menor_valor=1000,pos_menorc=0,pos_menorl=0;
    

        for(int linha=0;linha<3;linha++){
            for(int coluna=0;coluna<6;coluna++){
                vetor[linha][coluna]= aleatorio.nextInt(1000);
                System.out.println(vetor[linha][coluna]);
                if(vetor[linha][coluna]>maior_valor){
                    maior_valor=vetor[linha][coluna];
                    pos_maiorc= coluna;
                    pos_maiorl= linha;
                }
                else if(vetor[linha][coluna]<menor_valor){
                    menor_valor=vetor[linha][coluna];
                    pos_menorc= coluna;
                    pos_menorl= linha;
                }
            }
        }
        System.out.println("O maior valor foi: "+maior_valor+" localizado na linha: "+pos_maiorl+" e na coluna "+pos_maiorc);
        System.out.println("O menor valor foi: "+menor_valor+" localizado na linha: "+pos_menorl+" e na coluna "+pos_menorc);


    }
}
