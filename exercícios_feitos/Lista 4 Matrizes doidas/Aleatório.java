package Novos;
import java.util.Random;
public class Aleatório {
    public static void main(String[] args) {
        Random aleatorio= new Random();
        /*Aleatório com número máximo estipulado, sem valor mínimo
        System.out.println(aleatorio.nextInt(100));*/

        /*Aleatório com número máximo e mínimo definido. Quando colocamos no aleatório é contado do zero até o máximo. */
        int minimo=1;
        int maximo=10;
        int numeroGerado= minimo+aleatorio.nextInt(maximo);
        System.out.println(numeroGerado);
    }
    
}
