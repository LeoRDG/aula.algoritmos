//31

package src;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = leitor.nextDouble();

        if      ( salario <=  500 ) { salario *= 1.12; }
        else if ( salario <= 1200 ) { salario *= 1.05; }

        salario += salario <= 600 ? 150 : 100;

        System.out.println("O novo salário será: " + salario + " R$");
    }
}
