import java.util.Scanner;

public class Vanderson {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme o código da substância \n(1, 2, 3): ");
        int codigo = leitor.nextInt();

        System.out.print("Informe a temperatura da substância: ");
        double temp = leitor.nextDouble();

        String resultado = "\n";

        if (codigo == 1) {
            resultado += "Clorofórmio ";
            if (temp >= 61.2) {
                resultado += "em estado gasoso";
            } else if (temp >= -63.5) {
                resultado += "em estado liquido";
            } else {
                resultado += "em estado sólido";
            }
        }

        else if (codigo == 2) {
            resultado += "Propano ";
            if (temp >= -45) {
                resultado += "em estado gasoso";
            } else if (temp >= -190) {
                resultado += "em estado liquido";
            } else {
                resultado += "em estado sólido";
            }
        }

        else if (codigo == 3) {
            resultado += "éter etílico ";
            if (temp >= 35) {
                resultado += "em estado gasoso";
            } else if (temp >= -116) {
                resultado += "em estado liquido";
            } else {
                resultado += "em estado sólido";
            }
        }
        else {
            resultado = "codigo inválido";
        }
        System.out.println(resultado);
    }
}