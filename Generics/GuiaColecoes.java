import java.util.*;

public class GuiaColecoes {
    public static void main(String[] args) {
        // LISTA
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.set(1, "Novo B");
        System.out.println(lista); // [A, Novo B]

        // PILHA
        Stack<String> pilha = new Stack<>();
        pilha.push("Primeiro");
        pilha.push("Segundo");
        System.out.println(pilha.pop()); // Segundo

        // FILA
        Queue<String> fila = new LinkedList<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        System.out.println(fila.poll()); // Cliente 1

        // MAPA
        Map<String, String> mapa = new HashMap<>();
        mapa.put("CPF", "Lucas");
        mapa.put("RG", "123456");
        System.out.println(mapa.get("CPF")); // Lucas

        // CONJUNTO
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Item1");
        conjunto.add("Item1"); // Ignora duplicado
        System.out.println(conjunto); // [Item1]
    }
}
