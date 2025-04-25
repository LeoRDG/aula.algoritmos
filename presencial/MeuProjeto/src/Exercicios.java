import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
//        calculoMedia();
//        calculoSalario();
        calculoAluguel();
    }

    public static void calculoAluguel(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual o salário: ");
        double salario = leitor.nextDouble();

        System.out.print("Quantas partes do salário são usadas para pagar o aluguel: ");
        int partesAluguel = leitor.nextInt();

        double parteSalario = salario / 11.0;

        double valorAluguel = partesAluguel * parteSalario;
        double percentualAluguel = valorAluguel / salario;

        System.out.println("\nValor do aluguel: " + valorAluguel);
        System.out.println("Percentual do aluguel: " + (percentualAluguel*100) + "%\n");
    }

    public static void calculoMedia(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Número 1: ");
        int num1 = leitor.nextInt();

        System.out.print("Número 2: ");
        int num2 = leitor.nextInt();

        double peso1 = 2.5, peso2 = 3.5;

        System.out.println("\nMédia Simples: " + mediaSimples(num1, num2));
        System.out.println("Média Ponderada: " + mediaPonderada(num1, num2, peso1, peso2));
    }

    public static void calculoSalario(){
        Scanner leitor = new Scanner(System.in);
        double percentual = .15;

        System.out.print("Salário Base: ");
        double salarioBase = leitor.nextDouble();

        System.out.print("Total de Vendas: ");
        double totalVendas = leitor.nextDouble();

        double total = salarioBase + (percentual * totalVendas);
        System.out.println("Salário Total: " + total);

    }

    public static double mediaSimples(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double mediaPonderada(int a, int b, double peso1, double peso2) {
        return  ((a * peso1) + (b * peso2)) / (peso1 + peso2);
    }
}
