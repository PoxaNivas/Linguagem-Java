
/*
    Faça  um  programa  que  tenha  um  método  com  retorno  que  receba  um  vetor  de inteiros e calcule a somatória dos valores contidos no vetor.

 */


public class Lista8_ex1 {
    public static void main(String[] args) {
        int soma=0;
        int [] numeros= {1,2,3,4,5};
        soma=Soma(numeros);
        System.out.println("\n");
        System.out.println("A soma dos valores contidos no vetor é: "+soma);
        System.out.println("\n");

    }
    public static int Soma(int []num){
        int soma=0;
        for(int i=0;i<num.length;i++){
            soma+=num[i];
        }
        return soma;
    }
}
