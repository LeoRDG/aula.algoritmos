import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite o salário de Josevaldo: ");
        double salario = leitor.nextDouble();
        
        System.out.print("Digite quantas partes do salário vão para o aluguel: ");
        int partesAluguel = leitor.nextInt();

        double fracaoSalario = salario / 11;
        double valorAluguel = fracaoSalario * partesAluguel;
        double porcentagem  = partesAluguel / 11.0;

        System.out.println("O valor do aluguel é de R$" + valorAluguel + ", " + porcentagem * 100 + "% do salário\n");
    }
}
