import java.util.Scanner;
import java.util.LinkedList;

public class Ex6 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> fila = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            fila.add(leitor.nextInt());
        }

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

    }
}
