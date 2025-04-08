public class Pilha {
    private final int[] elementos;
    private int topo;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public void push(int valor) {
        if (topo == capacidade - 1) {
            throw new RuntimeException("Pilha Cheia!");
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha Vazia!");
        }
        return elementos[topo--];
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha Vazia!");
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public int size() {
        return topo+1;
    }
}
