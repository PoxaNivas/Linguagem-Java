/*
2. Faça um programa que tenha um método que calcule o Índice de Massa Corpórea (IMC) 
de uma pessoa e mostre sua condição, dependendo do sexo e do resultado do cálculo do 
IMC. As entradas serão sexo, altura e peso. O método será sem retorno.

 */

import java.util.Scanner;

public class Lista7_ex2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double peso, altura;
        String sexo,homem="homem",mulher="mulher";
        boolean same,same1;

            System.out.println("Seja bem-vindo(a) ao Exercício2");
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
            if(same==true){
                IMC_homem(peso,altura);
            }
            else{
                IMC_mulher(peso,altura);
            }
        
    }
    public static void IMC_homem(double p, double alt){
        double imc= p/(alt*alt);
        System.out.printf("%.2f",imc);

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

    public static void IMC_mulher(double p, double alt){
        double imc= p/(alt*alt);
        System.out.printf("%.2f",imc);

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
