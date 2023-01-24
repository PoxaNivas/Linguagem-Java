/*
 * 3. Faça um programa que receba uma palavra (String) e a transforme em um 
vetor de caracteres. Após feito isso, atribua em um vetor dinâmico, que deverá 
exibir todos os caracteres em uma única frase. Isso deverá ocorrer até que o 
usuário decida parar. Exemplo:
Digite uma palavra: Programar
Deseja digitar mais uma palavra? (S ou N): S
Digite uma palavra: é
Deseja digitar mais uma palavra? (S ou N): S
Digite uma palavra: fácil
Deseja digitar mais uma palavra? (S ou N): N
Frase final: “Programar é fácil
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Lista6_ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "CP850");
        ArrayList<Character> vetorD = new ArrayList<>();
        char resposta1='s',letrinha;
        String palavra_digitada;
        int tempo=0,aux=0;
        

        System.out.println("\n");
        do {
            tempo=tempo+1;

            if(resposta1=='s'|| resposta1=='S'){
                System.out.println("Digite uma palavra");
                for(int c=0;c<tempo-aux;c++){
                    palavra_digitada = input.nextLine();
                        for(int d=0;d<palavra_digitada.length();d++){
                            letrinha= palavra_digitada.charAt(d);
                            vetorD.add(letrinha);
                        }
                }
                System.out.println("Deseja adicionar uma nova palavra? S/N");
                resposta1 = input.next().charAt(0);
                vetorD.add(' ');
                if(tempo>1){
                aux=aux+1;
                }
            }
        }while(resposta1=='s'||resposta1=='S');
            System.out.println("Esta é a frase final: "+vetorD.toString().replaceAll(",",""));
            input.close();
    }
}
