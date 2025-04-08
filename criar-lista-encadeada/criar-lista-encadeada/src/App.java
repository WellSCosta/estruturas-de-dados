public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(4));

        list.insert(2, new Node(3)); // Inserir no meio

        list.printList(); // 1 -> 2 -> 3 -> 4 -> null

        list.remove(1); // Remove o 2
        list.printList(); // 1 -> 3 -> 4 -> null

        Node element = list.elementAt(1);
        System.out.println("Elemento no índice 1: " + element.valor); // Deve mostrar 3

        System.out.println("Tamanho da lista: " + list.size()); // Deve mostrar 3
    }
}
