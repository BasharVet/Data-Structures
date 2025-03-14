
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

    public void pop() {
        int poppedElement = popElement();
        if(poppedElement==-1){
            System.out.println("Stack is already Empty! No elements were popped");
            return;
        }
        System.out.println("Element " + poppedElement + " was popped!");
    }

    private int popElement() {
        int x = -1;
        if (isEmpty()) {
            return -1;
        }

        x = A[top];
        top--;

        return x;
    }
    
    public void peak(){
        int peakElement = peakElement();
        if(peakElement==-1){
            System.out.println("Stack is Empty! No elements to peak");
            return;
        }
        System.out.println("the top element: "+peakElement);
    }

    private int peakElement() {
        if (isEmpty()) {
            return -1;
        }
        return A[top];

    }

    public int length() {
        return top + 1;
    }

}
