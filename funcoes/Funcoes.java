package funcoes;

class Funcoes {
    public static void main(String[] args) {
        printar("Olá");

        printarComPrefixo("Olá", "Log");
        
        System.out.println(soma(1, 2));
        System.out.println(multiplica(2, 4));
    }

    public static void printar(String mensagem) {
        System.out.println(mensagem);
    }

    public static void printarComPrefixo(String mensagem, String prefixo) {
        System.out.println("[" + prefixo + "] " + mensagem);
    }

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int multiplica(int x, int y) {
        return x * y;
    }
}