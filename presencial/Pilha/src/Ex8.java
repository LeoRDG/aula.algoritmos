import java.util.LinkedList;
import java.util.Scanner;

public class Ex8 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        LinkedList<String> filaPizza = new LinkedList<>();
        LinkedList<String> filaSushi = new LinkedList<>();
        LinkedList<String> filaSushiDelivery = new LinkedList<>();
        LinkedList<String> filaSushiSalao = new LinkedList<>();
        LinkedList<String> filaPizzaDelivery = new LinkedList<>();
        LinkedList<String> filaPizzaSalao = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            String pedido = leitor.nextLine();
            if (pedido.contains("pizza") || pedido.contains("sushi")) {
                fila.add(pedido);
            }
        }

        while (!fila.isEmpty()){
            String pedido = fila.poll();
            if (pedido.contains("pizza")){
                filaPizza.add(pedido);
            } else {
                filaSushi.add(pedido);
            }
        }

        while (!filaSushi.isEmpty()){
            String pedido = filaSushi.poll();
            if (pedido.contains("salao")){
                filaSushiSalao.add(pedido);
            } else {
                filaSushiDelivery.add(pedido);
            }
        }
        while (!filaPizza.isEmpty()){
            String pedido = filaPizza.poll();
            if (pedido.contains("salao")){
                filaPizzaSalao.add(pedido);
            } else {
                filaPizzaDelivery.add(pedido);
            }
        }

        System.out.println(filaPizzaSalao);
        System.out.println(filaPizzaDelivery);
        System.out.println(filaSushiSalao);
        System.out.println(filaSushiDelivery);
    }
}
