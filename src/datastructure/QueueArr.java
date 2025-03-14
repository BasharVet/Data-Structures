
package datastructure;


public class QueueArr {

    private int capacity;
    private int[] A;
    private int front;
    private int rear;
    private int size;

    public QueueArr(int capacity) {
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

    public void deque() {
        int removedElement = dequeElement();
        if (removedElement == -1) {
            System.out.println("Queue is already Empty! No elements were enqueued yet");
            return;
        }
        System.out.println("Element " + removedElement + " has been dequeued(removed)");
    }

    private int dequeElement() {
        int x;

        if (isEmpty()) {
            return -1;
        }

        x = A[front];
        front++;
        size--;

        return x;

    }

    public int length() {
        return size;
    }

    public void first() {
        int firstElement = firstElement();
        if (firstElement == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println(firstElement);
    }

    private int firstElement() {
        if (isEmpty()) {
            return -1;
        }
        return A[front];
    }

}
