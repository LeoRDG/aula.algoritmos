import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o tamanho do primeiro prédio (metros): ");
        double predio1 = leitor.nextDouble();

        System.out.print("Qual o tamanho do segundo prédio (metros): ");
        double predio2 = leitor.nextDouble();

        System.out.print("Qual o distância entre os prédios (metros): ");
        double distancia = leitor.nextDouble();

        double cateto1 = distancia;
        double cateto2 = Math.abs(predio1 - predio2);

        double tirolesa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("A extensão da tirolesa será de " + tirolesa + "m\n");
    }
}
