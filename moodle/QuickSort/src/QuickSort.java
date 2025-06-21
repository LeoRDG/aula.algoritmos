public class QuickSort {
    static String[] colegas = {
            "Arthur Alberto Stachelski", "Guilherme Augusto Gollmann De Vargas",
            "Fabio Augusto Pescador", "Marlon Banfi Oro", "Mauricio Butelli", "Diego Carlesso",
            "Jean Carlos Berria", "Diogo Cidade", "Alis Correia Bittarello",
            "Emanuel Dagostini Tonial", "Miguel Dal Pra Madeira", "Pedro Daniel Do Prado Scapin",
            "Raquel De Camargo Vesolowski", "Vinicius De Lima Kaszmirski",
            "Leticia Fatima Haupczinski", "Matheus Felipe Sfredo Da Silva", "Gerald Fiorese",
            "Joao Guilherme Martins Elias", "Pedro Henrique Andrade", "Daniel Henrique Belle",
            "Gabriel Henrique Schaeffer", "Matheus Lang Wustro", "Maria Luisa Lopes De Almeida",
            "Alessandra Luize Nardi", "Giovani Marcos Degani", "Yan Matheus Paska Dos Santos",
            "Vitor Antonio Morgan", "Maria Paula Seibel Brock", "Guilherme Pedro Filipini",
            "Joao Pedro Tomazoni De Oliveira", "Jacir Pegoraro Junior", "Ariel Ramos",
            "Vitor Raphael Fernandes", "Lucca Reffiel Menta", "Leonardo Rodrigues Da Silva",
            "Nathan Roque Zonin", "Andre Salvador Borges", "Fernanda Soares Goncalves",
            "SIMONE SOSTISSO", "Rochele Tamires De Mello", "PATRICK TORRES", "Ricardo Zanoni", };

    public static void main(String[] args) {
        quickSort(colegas, 0, colegas.length-1);
        for (String i : colegas) {
            System.out.println(i);
        }
    }

    public static void quickSort(String[] array, int inicio, int fim) {
        if ( inicio < fim ) {
            int m = particao(array, inicio, fim);
            quickSort(array, inicio, m-1);
            quickSort(array,m+1, fim);
        }
    }

    public static int particao(String[] array, int inicio, int fim){
        String pivo = array[inicio];
        int m = inicio;

        for (int i = m+1; i <= fim; i++) {
            if (array[i].compareToIgnoreCase(pivo) <= 0) {
                troca( array, i, ++m );
            }
        }
        troca( array, inicio, m );
        return m;
    }

    public static void troca(String[] array, int index1, int index2){
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
