//19

import java.util.Scanner;

public class BisextoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = leitor.nextInt();

        String resultado = "O ano " + ano;

        resultado += (ano % 4 == 0) ? " é bisexto" : " não é bisexto";

        System.out.println(resultado);
    }
}
