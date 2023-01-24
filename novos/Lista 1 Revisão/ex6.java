import java.util.Scanner;

public class ex6 {
    public static void main (String[]args)throws Exception{
        Scanner Sc = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a)");
        int i=0;
        int q=0;
        int M= 0;
      
        for(int x=1;x<=10;x++)
        {
            System.out.println("Por favor,digite a idade do:"+ x +" º participante");
            i= Sc.nextInt();
            if (i >=18){
                q= q+1;
                M=M+i;

            }
        }
        double MF= M/10;
        System.out.println("Baseado nas informações fornecidas, há o total de "+ q+ " pessoas maiores de 18 anos");
        System.out.println("A idade média do grupo informado é "+MF);
     
    }

}
