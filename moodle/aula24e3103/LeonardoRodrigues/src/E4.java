import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = leitor.nextDouble();

        System.out.print("Digite o período em minutos: ");
        double tempo = leitor.nextDouble();

        double velocidadeMedia = distancia/(tempo/60);
        System.out.println("A velocidade média foi " + velocidadeMedia + " km/h");

        System.out.println();
    }
}
