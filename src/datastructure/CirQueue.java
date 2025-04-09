
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
        rear = (rear+1)%capacity;

        A[rear] = element;
        size++;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Noting to display!");
            return;
        }
        System.out.print("[");
        for (int i = 0; i <size; i++) {
            int index = (front + i)%capacity;
            
            System.out.print(A[index]);
            
            if(i!=size-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public int deque() {
        if (isEmpty()) {
            System.out.println("this Queue is Empty!");
            return -1;
        }
        int x;
        x = A[front];
        front = (front+1) %capacity;
        size--;

        return x;

    }
    public int length(){
        return size;
    }
}
