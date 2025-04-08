public class Fila {

    private final int[] elementos;
    private final int capacidade;
    private int frente;
    private int ultimo;
    private int size;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.frente = 0;
        this.ultimo = -1;
        this.size = 0;
    }

    public void enqueue(int valor) {
        if (capacidade == size) {
            throw new RuntimeException("Fila Cheia!");
        }

        ultimo = (ultimo + 1) % capacidade;
        elementos[ultimo] = valor;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila Vazia!");
        }
        int valor = elementos[frente];
        frente = (frente + 1) % capacidade;
        size--;

        return valor;
    }

    public int rear() {
        return elementos[ultimo];
    }

    public int front() {
        return elementos[frente];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
