import java.util.Scanner;

public class UsandoMetodos {
    static Scanner leitor = new Scanner(System.in);

    static int valorBase = 19;
    static int resultado = 1;

    public static void main(String[] args) {
        int resultado = 53;
        System.out.println( soma(1,2) );
        System.out.println(resultado);
        System.out.println(UsandoMetodos.resultado);

        double novo = nextDouble("Digite um numero");
    }

    private static int soma(int valor1, int valor2) {
        int resultado = valor1 + valor2 + valorBase;
        return  resultado;
    }

    private static double nextDouble(String mensagem){
        System.out.println(mensagem);
        return leitor.nextDouble();
    }

}


