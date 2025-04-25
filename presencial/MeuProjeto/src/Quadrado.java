import  java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme o lado do quadrado: ");
        double lado = leitor.nextDouble();

        double diagonal = Math.sqrt( Math.pow ( lado, 2 ) + Math.pow ( lado, 2 ) );
        double circun = Math.PI * diagonal;

        System.out.println("Diagonal: " + diagonal + "\nCircunferência: " + circun + "\n");

    }
}
