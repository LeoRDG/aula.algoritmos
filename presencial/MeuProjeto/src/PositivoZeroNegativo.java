import java.util.Scanner;

public class PositivoZeroNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();

        if (numero == 0) {
            System.out.println("O número é zero");
        } else if (numero > 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

    }
}
