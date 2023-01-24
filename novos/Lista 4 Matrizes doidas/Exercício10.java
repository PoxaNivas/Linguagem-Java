package Novos;
public class Exercício10 {
    public static void main(String[] args){
        int mat[][]=new int[3][4], c=1;
        int linha=0,coluna=0;

        for (linha = mat.length-1; linha >=0; linha--) {
            for (coluna = mat[0].length-1; coluna >=0; coluna--) {
                mat[linha][coluna] = c;
                c++;
            }
        }
        for(linha=0; linha<mat.length; linha++){
            System.out.print("\n| ");
            for(coluna=0; coluna<mat[0].length; coluna++){
                System.out.print(mat[linha][coluna]);
                if(coluna<mat[0].length-1){
                    System.out.print("  ");
                }else {
                    System.out.print(" |\t");
                }
            }
        }
        System.out.print("\n\n");
    }
}
