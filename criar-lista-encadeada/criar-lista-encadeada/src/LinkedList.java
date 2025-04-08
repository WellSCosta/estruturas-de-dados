public class LinkedList {

    private Node head;
    private int count = 0;

    // Adiciona um nó ao final da lista
    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = node;
        }
        count++;
    }

    // Remove o nó do final da lista e o retorna
    public Node pop() {
        if (head == null) {
            return null;
        }

        if (head.proximo == null) {
            Node temp = head;
            head = null;
            count--;
            return temp;
        }

        Node atual = head;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        Node temp = atual.proximo;
        atual.proximo = null;
        count--;
        return temp;
    }

    // Imprimir a lista
    public void printList() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }

    public int size() {
        return count;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }

        if (index == 0) {
            node.proximo = head;
            head = node;
        } else {
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            node.proximo = atual.proximo;
            atual.proximo = node;
        }
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }

        if (index == 0) {
            head = head.proximo;
        } else {
            Node atual = head;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
        }
        count--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }

        Node atual = head;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }

        return atual;
    }

}
