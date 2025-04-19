//17

package src;
import java.util.Scanner;

public class Congresso {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantas horas tem o congresso? ");
        int horasCongresso = leitor.nextInt();

        System.out.print("Quantas horas o participante compareceu? ");
        int horasParticipante = leitor.nextInt();

        double frequencia = horasParticipante / (double) horasCongresso;
        System.out.println("O participante frequentou " + frequencia * 100 + "% do congresso\n");
    }
}
