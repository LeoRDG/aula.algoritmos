import java.util.Scanner;

public class MediaAritmeticaSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        double media = (valor1 + valor2)/2.0;
        System.out.println("A média simples entre "+ valor1 + " e "+valor2 + " é "+ media);
        System.out.println();
    }
}
