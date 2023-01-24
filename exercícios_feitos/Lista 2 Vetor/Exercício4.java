package Novos;
import java.util. Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) ao Exercício 4 da Lista 2");
        System.out.println("Digite a quantidade de notas");
        int quantidade= input.nextInt();
        int vetor[]= new int[quantidade];
        int vetorp[]= new int[vetor.length];
        int i=0, soma=0,acima=0,numeroAtual=0;
        double media=0;
    
        for(i=0; i<quantidade;i++){
            System.out.println("Digite "+(i+1)+" º nota");
            vetorp[i]= input.nextInt();
            if (vetorp[i]==-1 || vetor[i]>99)
            break;
            numeroAtual= i;
            vetor[i]=vetorp[i];
            soma=soma+vetor[i];
            media=media+vetor[i];
        };
        media=media/quantidade;
       
        for(i=0;i<quantidade;i++){
            if(vetor[i]>media ){
                acima=acima+1;
            }
        }
   
        System.out.println("A média dos números digitados é: "+media);
        System.out.print("Os números foram digitados na seguinte ordem:");
        for(i=0; i<quantidade;i++){
            System.out.print(vetor[i]+",");
        }
        System.out.print("\n");
        for(i=vetor.length-1; i>=0;i--){
            System.out.println(vetor[i]);
        }
        System.out.println("há o total de "+acima+" acima da média");
        System.out.println("O programa analisou "+(numeroAtual+1)+" dados inseridos"+"\t");

    }
}