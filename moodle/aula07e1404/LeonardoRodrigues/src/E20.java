import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = leitor.nextInt();

        boolean divide4   = ano %   4 == 0;
        boolean divide100 = ano % 100 == 0;
        boolean divide400 = ano % 400 == 0;

        String resultado = "O ano " + ano;

        resultado += ( divide4 && ( !divide100 || divide400 )) ? " é bisexto" : " não é bisexto";

        System.out.println(resultado);
    }
}
