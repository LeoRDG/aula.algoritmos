import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");

        for (int ano = 2005; ano <= 2025; ano++) {

            switch (ano) {
                case 2017:
                case 2018:
                    System.out.println(ano +   " Categoria Mirim");
                    break;

                case 2016:
                case 2015:
                    System.out.println( ano + " Categoria Infantil");
                    break;

                case 2014:
                case 2013:
                case 2012:
                    System.out.println( ano + " Categoria Pré-Juvenil");
                    break;

                case 2011:
                case 2010:
                case 2005:
                    System.out.println( ano + " Categoria Juvenil");
                    break;
                default:
                    System.out.println( ano + " Ano de nascimento inválido");

            }
        }
    }
}
