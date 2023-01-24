
/*
 * 2. Faça um programa que tenha um método imprimePosicao(matriz,índice_linha, 
índice_coluna), que tem como função imprimir o valor de uma posição de uma matriz. Faça o 
tratamento específico para o caso de o índice não ser válido para a matriz.
 */
import java.util.Scanner;
import java.util.Random;

public class Lista9_ex2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] vetor = new int[3][3];
        boolean test = false;

        for (int l = 0; l < vetor.length; l++) {
            for (int c = 0; c < vetor.length; c++) {
                int temp = aleatorio.nextInt(99);
                vetor[l][c] = temp;
            }
        }

        for (int l = 0; l < vetor.length; l++) {
            for (int c = 0; c < vetor.length; c++) {
                System.out.print("[ " + vetor[l][c] + " ]");
            }
            System.out.println();
        }

        do {
            test = numeros(vetor);
        } while (test == true);

    }

    public static void imprimePosicao(int v[][], int ind_l, int ind_c) {
        System.out.println("O índice da linha " + ind_l + " e o indice da coluna " + ind_c);
        System.out.println("Encontraram o valor: " + v[ind_l][ind_c]);
    }

    // Verificador de números
    public static boolean numeros(int vetor[][]) {
        Scanner input = new Scanner(System.in);
        int ind_l = 0, ind_c = 0;
        boolean test = false;
        try {
            System.out.println("Em qual índice da linha você deseja adicionar?");
            ind_l = input.nextInt();
            System.out.println("Em qual índice da coluna você deseja adicionar?");
            ind_c = input.nextInt();
            test = false;
        } catch (Exception testa) {
            System.out.println("Valor inválido, digite números inteiros de 0 a "+(vetor.length-1));
            test = true;

        }
        if (ind_l >= vetor.length || ind_c >= vetor.length) {
            System.out.println("Indice digitado está superior ao indice do vetor");
            System.out.println("Os vetores possuim indices iniciam em 0 e vão até " + (vetor.length - 1));
            return true;
        } else if (test == false) {
            imprimePosicao(vetor, ind_l, ind_c);
            return false;
        } else {
            return true;
        }
    }
}
