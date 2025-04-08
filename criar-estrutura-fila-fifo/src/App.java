public class App {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(2);

        System.out.println("Primeiro: " + fila.front());
        System.out.println("Ultimo: " + fila.rear());
        System.out.println("Vazia? " + fila.isEmpty());
        System.out.println("Tamanho: " + fila.size());

        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println("Primeiro: " + fila.front());
        System.out.println("Ultimo: " + fila.rear());
        System.out.println("Vazia? " + fila.isEmpty());
        System.out.println("Tamanho: " + fila.size());
    }
}
