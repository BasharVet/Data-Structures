
package datastructure;


public class QueueArr {

    private int capacity;
    private int[] A;
    private int size;
    private int front;
    private int rear;

    public QueueArr(int capacity) {
        A = new int[capacity];
        this.capacity = capacity;
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return rear == (capacity - 1);
    }

    public boolean isEmpty() {
        return (rear < front);
    }

    public void enque(int element) {
        if (isFull()) {
            System.out.println("This Queue is Full!");
        } else {
            rear++;
            A[rear] = element;
            size++;
        }
    }

    public int deque() {
        int x=-1;
        if (isEmpty()) {
            System.out.println("This Queue is Empty!");
        } else {
            x = A[front];
            front++;
            size--;
        }
        return x;
    }
    public int first(){
        if (isEmpty()) {
            System.out.println("This Queue is Empty!");
            return -1;
        }
        return A[front];
    }
    public int length(){
        return 1+(rear-front);
    }
    public int length2(){
        return size;
    }

}
