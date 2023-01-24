/*
 * Faça um programa que leia uma quantidade de notas (referente a uma sala 
de aula), encerrando a entrada de dados quando for informado um valor igual a 
-1 (que não deve ser armazenado). Após a entrada de dados, faça:
• Mostre a quantidade de valores que foram lidos;
• Exiba todos os valores na ordem em que foram informados;
• Exiba todos os valores na ordem inversa à que foram informados, um 
abaixo do outro;
• Calcule e mostre a soma dos valores;
• Calcule e mostre a média dos valores;
• Calcule e mostre a quantidade de valores acima da média calculada
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Lista6_ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> quant_notas = new ArrayList<>();
        double nota, temp, soma = 0, media, Acmedia = 0;

        System.out.println("\n");
        System.out.println("Seja bem-vindo(a) a lista 6, exercício 4");
        do {
            System.out.println("Por favor,digite uma nota ");
            nota = input.nextDouble();
            if (nota == -1) {
                break;
            } else {
                quant_notas.add(nota);
                soma = soma + nota;
            }
        } while (nota != -1);
        input.close();;

        // Quantidade de notas
        System.out.println("Foram lidas " + quant_notas.size() + " notas");
        // Ordem em que foram informadas
        System.out.println("Informadas na seguinte ordem: " + quant_notas);
        // ordem inversa
        for (int i = quant_notas.size() - 1; i >= 0; i--) {
            System.out.println(quant_notas.get(i));
        }
        // soma dos valores
        System.out.println("A soma dos valores digitados é :" + soma);
        // Média dos valores
        media = soma / quant_notas.size();
        System.out.println("A média dos valores digitados é :" + media);
        /// acima da média
        for (int i = 0; i < quant_notas.size(); i++) {
            temp = quant_notas.get(i);
            if (temp > media) {
                Acmedia = Acmedia + 1;
            }
        }
        System.out.println(Acmedia+" estão acima da média");
        System.out.println("\n");

    }
}
