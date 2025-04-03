
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
        if (isEmpty()) {
            return -1;
        }

        int x = A[front];
        
        for (int i = 0; i < rear; i++) {
            A[i]=A[i+1];
        }
        
        rear--;
        size--;

        return x;

    }
    public void display(){
        System.out.print("[");
        for (int i = front; i <=rear; i++) {
            System.out.print(A[i]);
            if(i!=rear){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
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


