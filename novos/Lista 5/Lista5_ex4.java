import java.util.Scanner;


public class Lista5_ex4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String pala1, pala2;
    boolean Iguais;
    int pont=0;


        System.out.println("\n");
        System.out.println("Verificação de similaridade em 3 etapas");
        System.out.println("Por favor, digite a primeira palavra: ");
        pala1= input.nextLine();
        System.out.println("Por favor, digite a segunda palavra: ");
        pala2= input.nextLine();
        
            if(pala1.length() == pala2.length())
            {System.out.println("1º possuem o mesmo tamanho.");
            pont= pont+1;
                }
                Iguais = pala1.equalsIgnoreCase(pala2);
                if (Iguais ==true){
                    System.out.println("2º Em relação a igualdade de conteúdo, as palavras são iguais ");
                }
                    Iguais = pala1.equals(pala2);
                    if (Iguais ==true){
                        System.out.println("3º As palavras são do mesmo tamanho, possuem o mesmo conteúdo, mesmo considerando maiúsculas e minúsculas ");
                    }
            else{
                System.out.println("! Erro, uma das três etapas não foi concluída ! ");
                }
        input.close();
       
    }
}
