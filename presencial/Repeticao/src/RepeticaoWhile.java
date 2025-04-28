import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

//        double valor = leitor.nextDouble();
//
//        while (valor >= 0.0) {
//            double raiz = Math.sqrt( valor );
//            System.out.println("raiz = " + raiz);
//
//            valor = leitor.nextDouble();
//        }
        double valor;
        while ((valor = leitor.nextDouble()) >= 0.0) {
            double raiz = Math.sqrt(valor);
            System.out.println("raiz = " + raiz);
        }
    }
}
