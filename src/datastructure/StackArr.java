
package datastructure;


public class StackArr {

    private int capacity;
    private int[] A;
    private int top;

    public StackArr(int capacity) {
        this.capacity = capacity;
        A = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (capacity - 1);
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            System.out.println("-" + element + " wasn't added-");
            return;
        }
        top++;
        A[top] = element;
    }

    public int pop() {
        int x = -1;
        if (isEmpty()) {
            return -1;
        }

        x = A[top];
        top--;

        return x;
    }
    
    public int peak() {
        if (isEmpty()) {
            return -1;
        }
        return A[top];

    }

    public int length() {
        return top + 1;
    }

}
