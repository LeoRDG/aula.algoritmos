import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int totalSaltos = 5;
        Scanner leitor = new Scanner(System.in);
        double min = leitor.nextDouble();
        double soma = min;

        for (int i = 0; i < totalSaltos-1; i++) {
            double salto = leitor.nextDouble();
            soma += salto;
            min = salto < min ? salto : min;
        }
        soma -= min;
        System.out.printf("Média %f\n", soma/(totalSaltos-1));
    }
}
