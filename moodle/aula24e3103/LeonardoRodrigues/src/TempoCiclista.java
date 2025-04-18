import java.util.Scanner;

public class TempoCiclista {
    public static void main(String[] args) {
        System.out.println();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância em km: ");
        double distancia = leitor.nextDouble();

        System.out.print("Digite a velocidade média: ");
        double velocidade = leitor.nextDouble();

        double tempo = distancia/(velocidade);
        System.out.println("O tempo foi " + tempo + "h");

        System.out.println();
    }
}
