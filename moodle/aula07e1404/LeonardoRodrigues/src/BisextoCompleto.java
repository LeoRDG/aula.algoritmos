//20

package src;
import java.util.Scanner;

public class BisextoCompleto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = leitor.nextInt();

        boolean divide4   = ano %   4 == 0;
        boolean divide100 = ano % 100 == 0;
        boolean divide400 = ano % 400 == 0;

        if (divide4 && (!divide100 || divide400)) {
            System.out.println("O ano " + ano + " é bisexto");
        } else {
            System.out.println("O ano " + ano + " não é bisexto");
        }
    }
}
