import java.util.Scanner;
import java.lang.Math;

public class E1{
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite o raio de um circulo: ");
        double raio = tec.nextDouble();
        double c = 3.14 * 2 * raio;
        double area = 3.14 * Math.pow(raio, 2);
        double v = 3.0 / 4.0 * 3.14 * Math.pow(raio, 3);
        System.out.println("comprimento: " + c);
        System.out.println("area: " + area);
        System.out.println("volume: " + v);
    }
}
