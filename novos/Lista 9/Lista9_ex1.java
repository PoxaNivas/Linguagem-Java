
/*
 * 1. Faça um programa que simule a entrada de uma calculadora com as operações básicas. 
Caso a expressão esteja correta, a operação é realizada e o resultado será mostrado. Caso a 
expressão esteja errada, deverá ter o tratamento de exceção adequado. Exemplos:
Digite um número: 3
Operação: +
Digite um número: 2
Resultado: 5


Digite um número: 3
Operação: &
Digite um número: 2
Operador inválido!
Digite um número: 3
Operação: +
Digite um número: a
Número inválido!


Projeções:
números serão armazenados em ints, caso será digitado letras dará errados.
os sinais de operações verificados se estão dentro do vetor de chars
as operações serão feitas através de if's, 

InputMismatchException
 */
import java.util.Scanner;

public class Lista9_ex1 {
    public static void main(String[] args) {
        // Esta parte do código fará com que o validador ocorrá diversas vezes, sem
        // atrapalhar o restante do código.
        boolean n = false;
        do {
            n = numeros();
        } while (n == false);
    }

    public static boolean numeros() {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 0, op, resultado;
        boolean test_log = true;

        try {
            System.out.println("Por favor, digite o primeiro número");
            n1 = input.nextInt();

            System.out.println("Por favor, digite o segundo número");
            n2 = input.nextInt();

        } catch (Exception t) {
            System.out.println("Caracter inválido");
            test_log = false;
        }

        //aqui encerra o code se os números forem inválidos
        if (test_log == false) {
            return test_log;
        } else {
         //Esta parte do código fará com que o validador do operador ocorrá diversas vezes, sem
        // atrapalhar o restante do código.
            do {
                op = operador();
            } while (op == 'n');
        }
        //depois de verificado aqui ocorrerá a última verificação e a operação desejada
        if (op == '*') {
            resultado = n1 * n2;
            System.out.println("Resultado: " + resultado);
        } else if (op == '/') {
            try {
                resultado = n1 / n2;
                System.out.println("O resultado é " + resultado);
            } catch (java.lang.ArithmeticException div_zero) {
                System.out.println("O divisor não pode ser zero");
            }

        } else if (op == '+') {
            resultado = n1 + n2;
            System.out.println("O resultado é " + resultado);

        } else if (op == '-') {
            resultado = n1 - n2;
            System.out.println("O resultado é " + resultado);

        }

        //por fim, o return
        test_log = true;
        return test_log;
    }

    // código do operador
    public static char operador() {
        Scanner input = new Scanner(System.in);
        char op;
        boolean n = false;

        System.out.println("Qual operação deseja realizar?");
        System.out.println("'*' para multiplicação, '/' para divisão, '+' para soma, '-' subtração");
        op = input.next().charAt(0);
        char[] sinais = { '+', '-', '/', '*' };

        for (int i = 0; i < sinais.length; i++) {
            char temp = sinais[i];
            if (op == temp) {
                n = true;
                break;

            } else {
                n = false;
            }

        }
        if (n == true) {
            return op;

        } else {
            op = 'n';
            return op;
        }
    }
}