//Todos os imports mais utilizados

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class amb_test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Digite um número: ");
        a = entrada.nextInt();
        System.out.println("Digite um número: ");
        b = entrada.nextInt();
        try{
        resultado = a/b;
        System.out.println("Resultado:"+resultado);
        }
        catch(Exception e){
        System.out.println("Divisor não pode ser zero!");
        }
        }
    }
        