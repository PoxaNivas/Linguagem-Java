import java.util.Scanner;

public class vetor_estados {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in,"CP850");
        String vetor[]= new String [27];
            
            System.out.println("\n");
            for(int i=0;i<27;i++){
                System.out.println("Por favor digite do "+(i+1)+ " estado: ");
                vetor[i]= input.nextLine();
            }
            input.close();

            System.out.println("\n");
            System.out.println("Segundo informações fornecidas, os estados brasileiros são: ");
            for(int i=0;i<27;i++){
                System.out.print("---");
                System.out.println(vetor[i]);
            }

    }
}
