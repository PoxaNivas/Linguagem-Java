/*
 * 3. Refaça o exercício anterior, para que agora o programa tenha 2 métodos diferentes. Um 
método deverá apenas calcular o IMC (terá retorno) e outro método deverá receber esse 
valor de IMC e mostra a condição (sem retorno).
 */

import java.util.Scanner;

public class Lista7_ex3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double peso, altura, resultado;
        String sexo,homem="homem",mulher="mulher";
        boolean same,same1;

            System.out.println("Seja bem-vindo(a) ao Exercício3");

          

            System.out.println("Antes de começar, precisamos coletar algumas informações");
            do{
                System.out.println("Você é homem ou mulher?");
                sexo= input.nextLine();
                same=sexo.equalsIgnoreCase(homem);
                same1=sexo.equalsIgnoreCase(mulher);
            }
            while(same==false && same1==false);

            System.out.println("Por favor, digite seu peso");
            peso= input.nextDouble();
            System.out.println("Por favor, digite sua altura");
            altura=input.nextDouble();
            input.close();
            //inicia o método com retorno
            resultado= IMC(peso,altura);

            //inicia o método sem retorno
            if(same==true){
                IMC_homem(resultado);
            }
            else{
                IMC_mulher(resultado);
            }
        
    }
    //este é o método com retorno
    public static double IMC(double p, double alt){
        double imc= p/(alt*alt);
        return imc;
    }

    //este é o o método sem retorno
    public static void IMC_homem(double res){
        double imc= res;

        if(imc<20.7){
            System.out.println(" abaixo do peso");
        }
        else if(imc>=20.7 && imc<26.4){
            System.out.println(" no peso ideal");
        }
        else if(imc>=26.4 && imc<27.8){
            System.out.println(" levemente acima do peso");
        }
        else if(imc>=27.8 && imc<32.3){
            System.out.println(" acima do peso ideal");
        }
        else{
            System.out.println(" obeso");
        }
    }
    //este é o o método sem retorno
    public static void IMC_mulher(double res){
        double imc= res;

        if(imc<19.1){
            System.out.println(" abaixo do peso");
        }
        else if(imc>=19.1 && imc<25.8){
            System.out.println(" no peso ideal");
        }
        else if(imc>=25.8 && imc<27.3){
            System.out.println(" levemente acima do peso");
        }
        else if(imc>=27.3 && imc<31.1){
            System.out.println(" acima do peso ideal");
        }
        else{
            System.out.println(" obesa");
        }

    }
}
