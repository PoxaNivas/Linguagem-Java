import java.util.Scanner;

public class Lista5_ex3 {
    public static void main (String []args){
        int i=0, contagem=0,qEspaco=0;

        Scanner input = new Scanner (System.in);
        System.out.println("\n");
        System.out.println("Por favor, digite uma palavra: ");
        java.lang.String palavra = input.nextLine();
        input.close();
        String novapalavra = palavra.toLowerCase();
        char vogais[] = {'a','e','i','o','u'};
        char espacos = ' ';

       
        for (i=0;i<palavra.length();i++){
        
            char tempor = novapalavra.charAt(i);
            if (tempor == espacos){
                qEspaco=qEspaco+1;
            }
            for(int j=0;j<vogais.length;j++)
                if (tempor == vogais[j] ){
                    contagem= contagem+1;

                }
            }
            System.out.println("A palavra digitada tem "+ contagem+ " vogais e "+qEspaco+" espaços");
           
        }
        
    }
