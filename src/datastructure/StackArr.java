
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

    public void push(int x) {
        if (isFull()) {
            System.out.println("stack is full! you cant push any elements");
        } else {
            top++;
            A[top] = x;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is full! you cant pop any elements");
        }
        int x = A[top];
        top--;

        return x;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! you cant peek any elements");
        }
        return A[top];
    }

    public int length() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }
        return top + 1;
    }

}
