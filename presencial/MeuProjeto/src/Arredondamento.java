public class Arredondamento {
    public static void main(String[] args) {
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.ceil(-2.5));

        System.out.println(Math.floor(2.5));
        System.out.println(Math.floor(-2.5));

        System.out.println();
        System.out.println(Math.rint(2.98));
        System.out.println(Math.rint(2.5));
        System.out.println(Math.rint(2.08));

        System.out.println(Math.rint(3.58));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(   3.48));

        System.out.println();
        System.out.println(Math.round(2.98));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.08));

        System.out.println(Math.round(3.58));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.48));
    }
}
