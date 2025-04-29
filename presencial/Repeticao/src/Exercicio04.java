import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = leitor.nextInt();

        for (int i = num + 1; i <= num + 10; i++) {
            System.out.print(i + " ");
        }
    }
}
