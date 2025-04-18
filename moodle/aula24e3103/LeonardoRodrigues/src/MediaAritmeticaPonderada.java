import java.util.Scanner;

public class MediaAritmeticaPonderada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        double peso1 = 2.5;
        double peso2 = 3.5;

        double media = ((valor1*peso1) + (valor2*peso2))/(peso1 + peso2);
        System.out.println("A média ponderada entre "+ valor1 + " e "+valor2 + " é "+ media);
        System.out.println();
    }
}
