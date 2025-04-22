import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário base: ");
        double salarioBase = leitor.nextDouble();

        System.out.print("Digite o total de vendas: ");
        double vendas = leitor.nextDouble();

        double salarioFinal = salarioBase + vendas*.15;
        System.out.println("O salário final é " + salarioFinal);

        System.out.println();
    }
}
