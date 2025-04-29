import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            double num = leitor.nextDouble();

            if (num >= 10 && num <= 20) {
                contador++;
            }

        }
        System.out.println(contador + " valores estão no intervalo");
        System.out.println(10- contador + " valores não estão no intervalo");
    }
}
