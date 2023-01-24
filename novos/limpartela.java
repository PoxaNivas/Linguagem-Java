public class limpartela {
    public static void main(String[] args) {
        limpartela();
    }
    public static void limpartela(){
        try {
            new ProcessBuilder("cmd", "/c", "cls" ).inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    // este método tranforma valores verdadeiro /falso do boolean em sim ou não
    // com este método poderiamos utilizar um método boolean como canRead(que só retorna verdadeiro ou falso) e com o resultado dele
    // iniciar este método. Exemplo traduzir(variavel.canRead());
    public static String traduzir (boolean valor){
        if (valor==true)
            return "sim";
        else
            return "não";
    }
}
