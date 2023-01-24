package Novos;
import java.util.Random;
import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String chars = "acegikmoz";
        Random aleatorio = new Random();
        char a[][]=new char[5][5], o, p;
        int d=0, e=0;
        int linha=0,coluna=0;
        for(linha=0; linha<5; linha++){
            for(coluna=0; coluna<5; coluna++){
                char c = chars.charAt(aleatorio.nextInt(chars.length()));
                a[linha][coluna]=c;
            }
        }

        int n=(a.length * a[0].length);
        int pos[][]=new int[2][n];

        System.out.println("Digite a letra que deseja pesquisar: ");
        o=input.next().charAt(0);
        p=Character.toLowerCase(o);

        for(linha=0; linha<5; linha++){
            for(coluna=0; coluna<5; coluna++){
                if(a[linha][coluna]==p){
                    pos[0][d]=linha;
                    pos[1][d]=coluna;
                    d++;
                }else {
                    e++;
                }
            }
        }

        for (linha=0; linha<5; linha++) {
            System.out.print("\n| ");
            for (coluna=0; coluna<5; coluna++) {
                System.out.print(a[linha][coluna]);
                if (coluna<4) {
                    System.out.print(", ");
                }else {
                    System.out.print(" |");
                }
            }
        }

        if(e<n){
            System.out.println("\n\nLetra '"+p+"' encontrada em:");
            for (linha=0; linha<pos[0].length; linha++) {
                if(linha>0 && pos[0][linha]==0 && pos[1][linha]==0){
                }else {
                    System.out.print("A"+(pos[0][linha]+1)+(pos[1][linha]+1)+" ");
                }
            }
        }else {
            System.out.print("\n\nNenhuma letra '"+p+"' encontrada.");
        }

        System.out.print("\n\n");
        input.close();
    }    
}
