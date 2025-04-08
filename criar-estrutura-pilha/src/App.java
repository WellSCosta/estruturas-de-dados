public class App {
    public static void main(String[] args) {
       Pilha pilha = new Pilha(10);

       System.out.println("Está vazia? " + pilha.isEmpty());
       pilha.push(1);
       System.out.println("Push 1: " + pilha.top());
       pilha.push(2);
       System.out.println("Push 2: " + pilha.top());
       pilha.push(3);
       System.out.println("Push 3: " + pilha.top());

       System.out.println("Está vazia? " + pilha.isEmpty());
       System.out.println("Tamanho da pilha: " + pilha.size());
        
       pilha.pop();
       System.out.println("Pop 3: " + pilha.top());
       pilha.pop();
       System.out.println("Pop 2: " + pilha.top());
       pilha.pop();
    }
}
