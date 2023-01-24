import java.util.Scanner;

public class Lista5_ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Por favor, digite um números acima de 1000 ");
        String numeros = input.nextLine();
        input.close();

        System.out.println("\n");
        System.out.println("números digitados por extenso");
        for(int i=0;i<numeros.length();i++){
            char temp = numeros.charAt(i);
           
            switch(temp){
            case '0':
                System.out.print("zero"+",");
                break;
            case '1':
                System.out.print("um,");
                break;
            case '2':
                System.out.print("dois,");
                break;
            case '3':
                System.out.print("três,");
                break;
            case '4':
                System.out.print("quatro,");
                break;
            case '5':
                System.out.print("cinco,");
                break;
            case '6':
                System.out.print("seis,");
                break;
            case '7':
                System.out.print("sete,");
                break;
            case '8':
                System.out.print("oito,");
                break;
            case '9':
                System.out.print("nove,");
                break;
            default:
                System.out.println("não deu certo");
                
           }
       
        }
        System.out.println("\n");
    }
}
