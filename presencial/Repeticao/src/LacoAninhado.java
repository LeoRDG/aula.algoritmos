public class LacoAninhado {
    public static void main(String[] args) {
        for ( int i=0; i < 5; i++) {
            for (int j = 1; j <= 3; j++) {

                System.out.print("i:" + i);
                System.out.println("     j:" + j);
            }
            System.out.println();
        }
    }
}
