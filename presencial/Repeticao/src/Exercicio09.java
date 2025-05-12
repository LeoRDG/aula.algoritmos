public class Exercicio09 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
        boolean primo = true;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0 && j != 1) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

