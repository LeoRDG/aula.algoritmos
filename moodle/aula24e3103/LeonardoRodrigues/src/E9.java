import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        System.out.println("_____________________________________________________________________________");
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a a extensão total (km): ");
        double extensao = leitor.nextDouble();

        System.out.print("Digite a velocidade média de cruzeiro (km/h): ");
        double velocidadeCruzeiro = leitor.nextDouble();

        System.out.print("Digite a velocidade média automática (km/h): ");
        double velocidadeAuto = leitor.nextDouble();

        System.out.print("Digite o intervalo de piloto automático (min): ");
        double intervaloAuto = leitor.nextDouble() / 60;

        System.out.println();

        double tempoPrevisto       = extensao            / velocidadeCruzeiro;
        double extensaoAuto        = velocidadeAuto      * intervaloAuto;
        double tempoRestante       = tempoPrevisto       - intervaloAuto;
        double tempoAutoTotal      = extensao            / velocidadeAuto;
        double diferencaDistancias = Math.abs( extensao  - extensaoAuto );
        double velocidadeRestante  = diferencaDistancias / tempoRestante;

        System.out.println("O Tempo previsto em velocidade de cruzeiro é "             + tempoPrevisto       + "h");
        System.out.println("A Distância em piloto automático foi "                     + extensaoAuto        + "km");
        System.out.println("A diferença entre a extensão e a extensão automática foi " + diferencaDistancias + "km");
        System.out.println("O tempo restante para a viagem é "                         + tempoRestante       + "h");
        System.out.println("A velocidade necessária para completar a viagem é "        + velocidadeRestante  + "km/h");
        System.out.println("O tempo da viagem somente em piloto automático é "         + tempoAutoTotal      + "h");

        System.out.println("_____________________________________________________________________________\n");
    }
}
