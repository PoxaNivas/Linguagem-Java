package Novos;
import java.util. Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Digite a quantidade de notas");
        int quantidade= input.nextInt();
        int vetor[]= new int[quantidade];
        int i=0, soma=0,media=0,acima=0;
    
        for(i=0; i<quantidade;i++){
            System.out.println("Digite "+(i+1)+" º nota");
            vetor[i]= input.nextInt();
            soma=soma+vetor[i];
            media=media+vetor[i];
        };
        media=media/quantidade;

       
        for(i=0;i<quantidade;i++){
            if(vetor[i]>media){
                acima=acima+1;
            }
        }
        System.out.println("A média dos números digitados é: "+media);
        for(i=0; i<quantidade;i++){
            System.out.println("Os números foram digitados na seguinte ordem: "+vetor[i]);
        }
        for(i=vetor.length-1; i>=0;i--){
            System.out.println(" Agora na ordem inversa: "+vetor[i]);
        }
        System.out.println("há o total de "+acima+" acima da média");
    }
}
/* 
while (input<=0);

quantidade= quantidade+1;
*/