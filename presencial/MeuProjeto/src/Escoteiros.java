import java.util.Scanner;
import java.util.Formatter;

public class Escoteiros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos escoteiros? ");
        int escoteiros = leitor.nextInt();

        System.out.print("Quantas escoteiras? ");
        int escoteiras = leitor.nextInt();

        int totalJovens = escoteiros + escoteiras;

        int chefes = 1 + (int) Math.ceil(totalJovens / 6.0);

        String resultado =  String.format("%d escoteiros e %d escoteiras - total de %d chefes", escoteiros, escoteiras, chefes);

        if (escoteiros > 0) {
            resultado += ", ao menos 1 deve ser homem";
        }
        if (escoteiras > 0) {
            resultado += ", ao menos 1 deve ser mulher";
        }

        System.out.println(resultado);
    }
}