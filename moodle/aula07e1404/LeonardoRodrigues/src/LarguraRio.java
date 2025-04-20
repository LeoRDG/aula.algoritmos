//13

import java.util.Scanner;

public class LarguraRio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o trajeto do barco (metros): ");
        double trajeto = leitor.nextDouble();

        System.out.print("Qual a distância relative dos píeres (metros): ");
        double distancia = leitor.nextDouble();

        double largura = Math.sqrt(Math.pow(trajeto, 2) - Math.pow(distancia, 2));
        System.out.println("A largura do rio é de " + largura + "m\n");
    }
}
