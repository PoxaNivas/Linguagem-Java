import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        System.out.println("Por favor, digite dois valores quaisquer: ");
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        System.out.println("Por favor, escolha uma das opções abaixo: \n"
                + "1 - media entre os 2 numeros digitados\n"
                + "2 - qual o maior entre os 2 valores digitados \n"
                + "3 - produto dos 2 numeros digitados");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                float media = (n1 + n2) / 2;
                System.out.println("A media aritmetica " + media);
                break;
            case 2:
                if (n1 < n2) {
                    System.out.println(n2 + " é o maior numero");
                } else {
                    System.out.println(n1 + " é o maior numero");
                }
                break;
            case 3:
                float prod = n1 / n2;
                System.out.print("o produto total é: " + prod);
                break;
            default:
                System.out.print("erro, opção inexistente!!");
        }

    }
}
