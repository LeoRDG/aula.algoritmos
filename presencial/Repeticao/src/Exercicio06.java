import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        double primeiro = leitor.nextDouble();

        double minimo = primeiro;
        double maximo = primeiro;

        for (int i = 0; i < 20-1; i++) {
            double num = leitor.nextDouble();

            maximo = Math.max(maximo, num);
            minimo = Math.min(minimo, num);

//            if (num > maximo) {
//                maximo = num;
//            }
//
//            if (num < minimo) {
//                minimo = num;
//            }

//            maximo = num > maximo ? num : maximo;
//            minimo = num < minimo ? num : minimo;

        }

        System.out.println("\nO minimo é " + minimo);
        System.out.println("O maximo é " + maximo);
    }
}
