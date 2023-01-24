package Novos;

public class Exercício1 {
    public static void main(String[] args) {
    System.out.println("\n");
    System.out.println("Exercício 1, lista 4. ");
    System.out.println("Matriz 3 X 5 mostra a soma de todos os elementos da matriz");

    int vetor [][]= {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
    int vetorp=0;

    for (int linha=0;linha<3;linha++){
        for(int coluna=0;coluna<5;coluna++){
            vetorp=vetorp+vetor[linha][coluna];
        }
    }
    System.out.print(vetorp);
    System.out.println("\n");
  
    }
}
