package Novos;

public class MatrizEmMatriz {
    public static void main(String[] args) {
    int[] numeros = {1,2,3,4,5,6,7,8,9,10};
    int tam;
        for(int i = 0; i < numeros.length; i++ ){
            System.out.println("coluna "+(i+1));
            for(int j = 0; j <1; j++ ){
            System.out.println(numeros[i]);
            }
         }
    tam = numeros.length;
    System.out.println("Tamanho do vetor: "+ tam);
    }
}
