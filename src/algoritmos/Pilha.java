package src.algoritmos;

public class Pilha {
    private Object[] stackArray;
    private int top;

    public Pilha(int capacidade) {
        stackArray = new Object[capacidade];
        top = -1;
    }

    public int top() {
        return top;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Object elemento) {
        if (top < stackArray.length - 1) {
            top++;
            stackArray[top] = elemento;
        } else {
            throw new IllegalStateException("Pilha está cheia");
        }
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha está vazia");
        }
        Object elementoRemovido = stackArray[top];
        stackArray[top] = null;
        top--;
        return elementoRemovido;
    }
}
