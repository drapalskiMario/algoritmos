package src;

public class Fila {
    private Object[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Fila(int capacidade) {
        queueArray = new Object[capacidade];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Object elemento) {
        if (size < queueArray.length) {
            rear = (rear + 1) % queueArray.length;
            queueArray[rear] = elemento;
            size++;
        } else {
            throw new IllegalStateException("A fila está cheia");
        }
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        Object elementoRemovido = queueArray[front];
        queueArray[front] = null;
        front = (front + 1) % queueArray.length;
        size--;
        return elementoRemovido;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int front() {
        return front;
    }

    public int rear() {
        return rear;
    }
}
