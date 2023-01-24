/*
 * 4. Faça um método que receba um valor inteiro e positivo, calcule e mostre o seu fatorial. O 
método terá que verificar se o número é positivo, para executar o cálculo. Método com
retorno. 
 */


import java.util.Scanner;

public class Lista7_ex4 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int numero,resultado;
        

            System.out.println("Por favor, digite um número");
            numero= input.nextInt();
            resultado=positivo(numero);
            System.out.println(resultado);

    }
}

    /*Não terminei esse programa
    public static int positivo(int temp){
        int numero=temp,i=1;
        int fatorial=1;
    }
}

*/