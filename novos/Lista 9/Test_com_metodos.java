

public class Test_com_metodos {
    public static void main(String[] args) {
        int soma;
        soma=Soma2(1,2,4,5);
        System.out.println("O resultado da soma é "+soma);

    }
    public static int Soma(int p,int s){
        int valor= p+s;
        return valor;
    }

    // Como criar um método que permite uma lista de parametros 
    public static int Soma2(int...numeros){
        int res=0;
        for (int n:numeros){
            res+=n;
        }
        return res;
    }
    // como criar uma sobrecarga: criamos o mesmo métodos, mas com argumentos diferentes.
    public static double Soma2(double...numeros){
        int res=0;
        for (double n:numeros){
            res+=n;
        }
        return res;
    }
}

