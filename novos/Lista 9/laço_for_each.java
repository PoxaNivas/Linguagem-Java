import java.util.ArrayList;

public class laço_for_each {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();
          
            numeros.add(10);
            numeros.add(22);
            numeros.add(33);

            carros.add("doblo");
            carros.add("fiat uno");
            carros.add("fiat duo");
            carros.add(1,"fiat");
            carros.add(0,"pickup");
            carros.add(0,"montana");

                for (int c:numeros){
                    System.out.println(c);
                }
                for (String c:carros){
                    System.out.println(c);
                }
                try{
                    System.out.println(carros.get(10));
                }catch (Exception e){
                    System.out.println("erro" + e.getMessage());
                }
                
    }
}
