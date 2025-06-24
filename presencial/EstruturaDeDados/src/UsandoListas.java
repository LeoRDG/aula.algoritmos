import java.util.ArrayList;

public class UsandoListas {
    public static void main(String[] args) {
        ArrayList< String > lista = new ArrayList<>();

        int tam = lista.size();
        System.out.println("\nTamanho atual: " + tam);
        boolean estaVazia = lista.isEmpty();
        System.out.println("Esta vazia? " + estaVazia);

        lista.add("Erechim");
        lista.add("Passo Fundo");
        lista.add("Sertão");

        estaVazia = lista.isEmpty();
        System.out.println("\nEsta vazia? " + estaVazia);
        tam = lista.size();
        System.out.println("Tamanho atual: " + tam);
        System.out.println("Elemento 0: " + lista.get(0));
        System.out.println("Elemento 1: " + lista.get(1));
        System.out.println("Elemento 2: " + lista.get(2));

        lista.add(1, "Getúlio Vargas");

        tam = lista.size();
        System.out.println("\nTamanho atual: " + tam);
        System.out.println("Elemento 0: " + lista.get(0));
        System.out.println("Elemento 1: " + lista.get(1));
        System.out.println("Elemento 2: " + lista.get(2));
        System.out.println("Elemento 3: " + lista.get(3));

        lista.remove(2);
        tam = lista.size();
        System.out.println("\nTamanho atual: " + tam);
        System.out.println("Elemento 0: " + lista.get(0));
        System.out.println("Elemento 1: " + lista.get(1));
        System.out.println("Elemento 2: " + lista.get(2));

        lista.set(1, "Estação");
        tam = lista.size();
        System.out.println("\nTamanho atual: " + tam);
        System.out.println("Elemento 0: " + lista.get(0));
        System.out.println("Elemento 1: " + lista.get(1));
        System.out.println("Elemento 2: " + lista.get(2));

        lista.clear();
        tam = lista.size();
        System.out.println("\nTamanho atual: " + tam);
    }
}
