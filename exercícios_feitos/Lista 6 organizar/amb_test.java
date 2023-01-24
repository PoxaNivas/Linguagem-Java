//Todos os imports mais utilizados

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class amb_test {
    public static void main(String[]args){
        //Declarações iniciais
        Scanner input= new Scanner(System.in,"CP850");
        Random aleatorio= new Random();
        //
        //------Início do código--------
       // cria um novo ArrayList de strings com uma capacidade inicial de 10
            ArrayList<Character> itens = new ArrayList<>(); 
            char[] vetor= new char['a'];
            itens.add('s');
           
           


            itens.add("red"); // anexa um item à lista 
            itens.add(0, "yellow"); // insere "yellow" no índice 0
            // cabeçalho
            System.out.print("Display list contents with counter-controlled loop:"); 
            // exibe as cores na lista
            for (int i = 0; i < itens.size(); i++)
            System.out.printf(" %s", itens.get(i));
    }
}
