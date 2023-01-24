import java.util.Scanner;

public class E2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da prestação: ");
        double prest = sc.nextDouble();
        System.out.println("Digite a taxa (sem utilizar %): ");
        double taxa = sc.nextDouble();
        System.out.println("Digite o tempo: ");
        int temp = sc.nextInt();
        double valor = prest + (prest * (taxa / 100) * temp);
        System.out.println("valor da prestação atualizado: " + valor);
        
    }
}
