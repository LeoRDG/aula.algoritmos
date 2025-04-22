import java.util.Scanner;

public class E29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha1 = 0;
        while (escolha1 != 1 && escolha1 != 2) {
            System.out.println("\nEscolha: \n(1) Ave\n(2) Mamífero");
            escolha1 = leitor.nextInt();
        }

        int escolha2 = 0;
        while (escolha2 != 1 && escolha2 != 2) {
            System.out.println("\nEscolha: \n(1) Onívoro\n(2) Carnívoro");
            escolha2 = leitor.nextInt();
        }
        escolha2 *= 4;

        String resultado = "Seu animal é: ";
        switch ( escolha1 + escolha2 ) {
            case 0b0101:
                resultado += "pombo";
                break;
            case 0b1010:
                resultado += "onça";
                break;
            case 0b0110:
                resultado += "porco";
                break;
            case 0b1001:
                resultado += "águia";
                break;
        }

        System.out.println(resultado);
    }
}
