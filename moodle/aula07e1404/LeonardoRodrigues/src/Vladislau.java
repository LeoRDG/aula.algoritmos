//18

import java.util.Scanner;

public class Vladislau {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o valor total comprado? ");
        double valorTotal = leitor.nextDouble();

        int frete = valorTotal < 120 ? 15 : 0;
        System.out.println("O valor do frete será " + frete + "R$\n");
    }
}
