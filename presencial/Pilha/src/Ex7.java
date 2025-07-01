import java.util.LinkedList;
import java.util.Scanner;

public class Ex7 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Integer> fila = new LinkedList<>();
        LinkedList<Integer> filaPos = new LinkedList<>();
        LinkedList<Integer> filaNeg = new LinkedList<>();


        for (int i = 0; i < 30; i++) {
            fila.add(leitor.nextInt());
        }

        while (!fila.isEmpty()){
            int num = fila.poll();
            if (num > 0) {
                filaPos.add(num);
            } else {
                filaNeg.add(num);
            }
        }

        System.out.println(filaPos);
        System.out.println(filaNeg);
    }
}
