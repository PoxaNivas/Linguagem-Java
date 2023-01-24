//Todos os imports mais utilizados

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[]args){
        //Declarações iniciais
        Scanner input= new Scanner(System.in,"CP850");
        //
        //------Início do código--------
       // cria um novo ArrayList de strings com uma capacidade inicial de 10
            String palavra;
            char continuar;
            ArrayList<Character> vetor= new ArrayList<>();
            do{
                System.out.println("Digite uma palavra");
                palavra= input.nextLine();
                char letra[]= new char[palavra.length()];
                for(int i=0;i<palavra.length();i++){
                    letra[i]=palavra.charAt(i);
                    vetor.add(letra[i]);
                }
                System.out.println("Deseja continuar?");
                continuar=input.next().charAt(0);

            }while(continuar=='s');
            input.close();
    }
}
