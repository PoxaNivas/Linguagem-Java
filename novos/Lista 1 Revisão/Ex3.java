import java.util.Scanner;

public class Ex3 {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Por favor, digite a primeira nota: ");
        double N1 = Sc.nextDouble();
        System.out.print("Por favor, digite a segunda nota: ");
        double N2 = Sc.nextDouble();
        double M = (N1+N2)/2;
        System.out.println(M);
        if (M <=3.9){
            System.out.println("Reprovado");
        }
        else if (M >=4 && M<=6.9){
            System.out.println("Em exame");
            }
        else{
            System.out.println("Aprovado");
        }
       
    }
}
