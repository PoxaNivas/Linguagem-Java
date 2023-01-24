package Novos;
import java.util.Scanner;
import java.util.Arrays;

public class Exercício5 {
    public static void main(String[]args){
    Scanner input= new Scanner(System.in);
    float vetor[][]= new float [10][5],vetor_mi[]=new float[10];
    float media=0;
    int linha=0,coluna=0;
        for( linha=0;linha<10;linha++){
            System.out.println("Seja bem-vindo(a) aluno(a) "+(linha+1)+" ao organizador de notas ");
            for( coluna=0;coluna<5;coluna++){
                System.out.println("Por favor, digite a nota da "+(coluna+1)+" ª materia");
                vetor[linha][coluna]=input.nextInt();
                media= media+vetor[linha][coluna];
                vetor_mi[linha]=vetor_mi[linha]+vetor[linha][coluna];
            }
            vetor_mi[linha]=vetor_mi[linha]/5;
        }
    media=media/50;
    System.out.println("\n a média geral é "+ media+"\n");
        for(linha=0;linha<10;linha++){
                if(vetor_mi[linha]> media){
                    System.out.println("o(a) aluno(a) "+(linha+1)+ " foi aprovado com a média "+vetor_mi[linha]);
                }
                else{
                    System.out.println("o(a) aluno(a) "+(linha+1)+" não foi aprovado pois estava abaixo da média "+vetor_mi[linha]);
                }
            }
            System.out.println("Nova técnica"+ Arrays.deepToString(vetor));
    }
}
