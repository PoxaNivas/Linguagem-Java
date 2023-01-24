import java.util.Scanner;

public class E3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("digite sua segunda nota: ");
        float n2 = sc.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println(media);
        if (media <= 3.9) {
            System.out.println("reprovado!!!");
        } else if (media >= 4.0 && media <= 6.9) {
            System.out.println("exame!!!");
        } else {
            System.out.println("aprovado!!!");
        }

    }
}
