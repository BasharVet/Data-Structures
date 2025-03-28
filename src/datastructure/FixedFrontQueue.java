
package datastructure;

public class FixedFrontQueue {
    private int capacity;
    private int[] A;
    private int front;
    private int rear;
    private int size;

    public FixedFrontQueue(int capacity) {
        this.capacity = capacity;
        A = new int[capacity];
        rear = -1;
        front = 0;
        size = 0;

    }

    public boolean isFull() {
        return rear == (capacity - 1);
    }

    public boolean isEmpty() {
        return rear < front;
    }

    public void enque(int element) {
        if (isFull()) {
            System.out.println("Queue is Full! "+element+" wasn't added");
            return;
        }
        rear++;
        A[rear] = element;
        size++;
    }
    public int deque() {
        int x;

        if (isEmpty()) {
            return -1;
        }

        x = A[front];
        
        for (int i = 0; i < rear; i++) {
            A[i]=A[i+1];
        }
        
        rear--;
        size--;

        return x;

    }
    public void display(){
        for (int i = front; i <=rear; i++) {
            System.out.println(A[i]);
        }
    }

    public int length() {
        return size;
    }

    public int firstElement() {
        if (isEmpty()) {
            return -1;
        }
        return A[front];
    }

}


