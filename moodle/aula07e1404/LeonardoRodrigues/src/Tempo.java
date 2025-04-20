//21

import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos segundos durou o evento? ");
        int duracao = leitor.nextInt();

        int segundos = duracao % 60;
        int minutos  = duracao / 60 % 60;
        int horas    = duracao / 60 / 60 % 24;
        int dias     = duracao / 60 / 60 / 24;

        System.out.println(dias + "-"  + horas + ":"  + minutos + ":" + segundos);
    }
}
