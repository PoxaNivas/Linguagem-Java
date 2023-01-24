/*
 * 4.Faça um programa com um método que busca um valor dentro de um vetor. Para isso o método deverá receber o vetor e o valor a ser buscado. Caso o valor se encontre no vetor, mostrar em qual índice ele se encontra. Caso não exista esse valor no vetor, mostrar essa informação.Método sem retorno.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Lista8_ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []vetor= new int[9];
        int resposta;
        
        System.out.println("Qual número deseja procurar: ");
        resposta=input.nextInt();
        
        for(int a=0;a<vetor.length;a++){
            System.out.println("Por favor, digite um valor para a posição"+(a+1));
            vetor[a]=input.nextInt();
        }
        buscav(resposta,vetor);
        System.out.println(Arrays.toString(vetor));
        
        input.close();
    }
    public static void buscav(int r,int []v){
        boolean n=false;
        for(int a=0;a<v.length;a++){
            if(r==v[a]){
                n=true;
                System.out.println("O valor desejado foi encontrado no índice "+ a);
                break;
            }
            else{
                n=false;
            }
        }
        if(n == false){
            System.out.println("O valor desejado não foi encontrado no índice ");
            
        }
    }
}

//dois argumentos: um será o vetor e o outro o número a ser procurado