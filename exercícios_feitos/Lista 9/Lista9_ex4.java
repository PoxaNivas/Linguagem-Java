/*
 4. Faça um programa que simule um sistema bancário simples, onde podemos depositar, sacar 
e verificar saldo (usando métodos). O sistema não poderá permitir sacar um valor que seja 
maior do que aquele existente em conta. Este programa deverá ser encerrado pelo usuário e 
suponha que o saldo inicial será de 1000. A cada saque ou deposito, o programa mostrará o 
saldo atual. Use tratamento de exceção para tratar possíveis erros. Um possível menu para 
esse exercício seria:
1. Sacar
2. Depositar
3. Verificar saldo
4. Sair
 */

/*
 * O sistema não poderá permitir sacar um valor que seja 
maior do que aquele existente em conta.
 */
import java.util.Scanner;

public class Lista9_ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor, total, saldo = 1000;
        char resposta = 'n';
        int op = 0;

        do {
            System.out.println("Seja bem-vindo(a) ao ATM");
            do {
                op = menu();
            } while (op == 0);

            switch (op) {
                case 1:
                    // deposito
                    System.out.println("Quanto deseja depositar? ");
                    System.out.print("R$: ");
                    do{
                        valor= ver_n();
                    }while(valor==-1);
                    total = deposito(valor, saldo);
                    saldo = total;
                    System.out.println("Saldo atual " + saldo);
                    break;
                case 2:
                    // retirada
                    System.out.println("Quanto deseja retirar ?");
                    System.out.print("R$: ");
                    do{
                        valor= ver_n();
                    }while(valor==-1);
                    if(valor>=saldo){
                        System.out.println("Valor indisponível");
                        break;
                    }
                    else{
                        total = retirada(valor, saldo);
                        System.out.println("Saldo atual " + total);
                        saldo = total;
                        break;
                    }
                   
                case 3:
                    saldo=saldo(saldo);
                    System.out.println("Seu saldo atual é R$" + saldo);

                    break;

                case 4:
                    System.out.println("Obrigado por utilizar ");
                    break;

                default:
                    System.out.println("Opção inválida ");
                    break;
            }

            System.out.println("\n");
            System.out.println("Deseja realizar outra operação? S/N");
            resposta = input.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');
        System.out.println("Banco24Horas agradece ");
    }
    // fora da classe main

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int op = 0;

        System.out.println("Qual operação deseja realizar? ");
        System.out.println("1- Depósito");
        System.out.println("2- Retirada");
        System.out.println("3- Saldo");
        System.out.println("4- Sair");
        System.out.println();
        System.out.print("Operação: ");
        try {
            op = input.nextInt();
            return op;
        } catch (Exception ops) {
            op = 0;
        }
        return op;
    }

    public static double ver_n(){
        Scanner input = new Scanner(System.in);
        double numer;
        try {
            System.out.println("Digite o valor");
            numer = input.nextDouble();
         
        } catch (Exception ops) {
           numer=-1;
        }
        return numer;
    }
    public static double deposito(double dep, double sal) {
        double saldo = sal;
        saldo += dep;
        return saldo;
    }

    public static double retirada(double ret, double sal) {
        double saldo = sal;
        saldo -= ret;
        return saldo;
    }
    public static double saldo(double sald){
        double saldo= sald;
        return saldo;
    }

}
