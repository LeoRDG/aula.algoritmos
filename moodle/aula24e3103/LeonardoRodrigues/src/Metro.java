import java.sql.SQLOutput;
import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        System.out.println("_____________________________________________________________________________");
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a a extensão total (km): ");
        double extensaoTotal = leitor.nextDouble();

        System.out.print("Digite a velocidade média padrão (km/h): ");
        double velocidadePadrao = leitor.nextDouble();

        System.out.print("Digite a velocidade média ajustada (km/h): ");
        double velocidadeAjustada = leitor.nextDouble();

        System.out.println();

        double tempoPrevisto         = extensaoTotal          / velocidadePadrao;
        double tempoEfetivo          = extensaoTotal          / velocidadeAjustada;
        double distanciaPossivel     = velocidadeAjustada     * tempoPrevisto;
        double diferencaDistancias   = Math.abs(extensaoTotal - distanciaPossivel);
        double diferencaTempos       = Math.abs(tempoPrevisto - tempoEfetivo);

        System.out.println("Tempo Previsto era " + tempoPrevisto       + "h");
        System.out.println("Tempo Efetivo foi "  + tempoEfetivo        + "h");
        System.out.println("Diferença de "       + diferencaTempos     + "h\n");
        System.out.println("Distancia Possivel " + distanciaPossivel   + "km");
        System.out.println("Diferença de "       + diferencaDistancias + "km");

        System.out.println("_____________________________________________________________________________\n");
    }
}
