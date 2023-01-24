/*
 *3. Analise o código abaixo e veja quais são os possíveis erros que podem ocorrer, em relação de entrada 
de dados. Depois, faça o tratamento de exceção necessário.
 Scanner entrada = new Scanner(System.in);
 int num;
 String str;
 System.out.print("Digite um número: ");
 str = entrada.nextLine();
 num = Integer.parseInt(str);
 System.out.println("Num: "+num);
 */
import java.util.Scanner;

public class Lista9_ex3 {
    public static void main(String[]args){
        boolean test;
        do{
            test=conversao();
        }while(test==true);
        System.out.println(" fim do programa  ");
       
    }
    public static boolean conversao(){
        Scanner input = new Scanner(System.in);
        int num;
        String str;
        System.out.print("Digite um número: ");
        str = input.nextLine();
        boolean test=false;
        try{
            num = Integer.parseInt(str);
            System.out.println("Num: "+num);
            test=false;
        }
        catch(java.lang.NumberFormatException stri){
            System.out.println("Caracter inválido, digite apenas números inteiros. ");
            System.out.println("Exemplo: 0, 1, 2 etc.");
            System.out.println("\n");
            test=true;
        }
        finally{
            System.out.println();
        }
       return test;
    }
}

//atenção a palavra entrada,
//letras dão erro
//números reais dão erro
