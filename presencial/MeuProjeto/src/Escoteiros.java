import java.util.Scanner;

public class Glaucia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a largura do aquário (cm)? ");
        double diametro = leitor.nextDouble();

        double raio = diametro / 2;

        double volume = (4 / 3.0 * Math.PI * Math.pow(raio, 3)) * 0.001;

        double area = 4 * Math.PI * Math.pow(raio, 2);

        System.out.printf("A area será %.2f cm²\n", area);
        System.out.printf("O volume será %.2f litros\n", volume);
    }
}