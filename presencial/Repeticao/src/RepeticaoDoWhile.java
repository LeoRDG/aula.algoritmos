import java.util.Scanner;

public class RepeticaoDoWhile {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();

        do {
            System.out.println("raiz " + Math.sqrt(valor));
            valor = leitor.nextDouble();
            } while (valor >=0) ;
        }
    }
