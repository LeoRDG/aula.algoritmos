import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        System.out.println();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tempo: ");
        double tempo = leitor.nextDouble();

        System.out.print("Digite a velocidade média: ");
        double velocidade = leitor.nextDouble();

        double distancia = tempo * velocidade;
        System.out.println("A distancia foi " + distancia);

        System.out.println();
    }
}
