import java.util.Scanner;

public class CalculoRaiz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();

        if (valor >= 0) {
            double raiz = Math.sqrt(valor);
            System.out.println("Raiz: " + raiz);
        }

        System.out.println("Fim do programa");
    }

}
