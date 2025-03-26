
package datastructure;


public class CirQueue {
    private int[]A;
    private int capacity;
    private int front;
    private int rear;
    private int size;
    
    public CirQueue(int capacity){
        this.capacity=capacity;
        A = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
        
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
    public void enque(int element) {
        if (isFull()) {
            System.out.println("this Queue is Full!");
            return;
        }
        // instead of just writing -> rear++;
        // do this logic:
        if (rear == (capacity - 1)) {// means that the last position in the Queue is occupied
            rear = 0;
        } else {
            rear++;
        }

        A[rear] = element;
        System.out.println("The element "+element+" is inserted at index "+rear);
        size++;
    }

    public int deque() {
        if (isEmpty()) {
            System.out.println("this Queue is Empty!");
            return -1;
        }
        int x;
        x = A[front];
        if (front == (capacity - 1)) {// means if there's only one last element in the Queue
            front = 0;
        } else {
            front++;
        }
        size--;

        return x;

    }
}
