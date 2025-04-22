import java.util.Scanner;

public class E24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor real: ");
        double valor = leitor.nextDouble();

        if (valor >= 0 && valor <= 100){
            if (valor <= 25) {
                System.out.println("[0,25]");
            }
            else if (valor <= 50) {
                System.out.println("(25,50]");
            }
            else if (valor <= 75) {
                System.out.println("(50,75]");
            }
            else {
                System.out.println("(75,100]");
            }

        } else {
            System.out.println("Fora de intervalo");
        }

    }
}
