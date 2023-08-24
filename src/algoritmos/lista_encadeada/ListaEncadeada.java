package src.algoritmos.lista_encadeada;

public class ListaEncadeada {
    private NoListaEncadeada head; // Referência para o primeiro nó da lista
    private int size;  // Número de elementos na lista


    public ListaEncadeada() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(Object elemento) {
        NoListaEncadeada newNode = new NoListaEncadeada(elemento);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        Object elementoRemovido = head.data;
        head = head.next;
        size--;
        return elementoRemovido;
    }

    public void printList() {
        NoListaEncadeada current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
