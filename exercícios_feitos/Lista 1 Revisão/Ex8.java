import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int divisor, dividendo, c;
        
        System.out.println("Olá, seja bem-vindo(a) ao calculador do MDC");
        System.out.println("Por favor, digite um número");
        int a = input.nextInt();
        System.out.println("Por favor, digite outro número");
        int b = input.nextInt();
       
        if(b >a){
            dividendo=b;
            divisor=a;
        }
        else{
            dividendo=a;
            divisor=b;
        } 
        
       int resto = dividendo % divisor;
        
        while(resto != 0){
        
        
            c= dividendo/divisor;
            dividendo= divisor;
            divisor=c;
        }
        System.out.println(divisor);
}
}