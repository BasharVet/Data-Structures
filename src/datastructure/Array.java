
package datastructure;


public class Array {

    private int A[];
    private int capacity;
    private int size;

    public Array(int capacity) {
        this.capacity = capacity;
        size = 0;
        A = new int[capacity];

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getFirst() {
        if (!isEmpty()) {
            return A[0];
        } else {
            System.out.println("This array is Empty");
        }

        return -999;
    }

    public int getLast() {
        if (!isEmpty()) {
            return A[size - 1];
        } else {
            System.out.println("This array is Empty");
        }

        return -999;
    }

    public int getElement(int i) {
        if (i >= 0 && i < size) {
            return A[i];
        } else {
            System.out.println("index \'" + i + "\' is out of bounds !!");
        }
        return -999;
    }

    public void display() {

        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i]);
            if (i != size - 1) {
                System.out.print(",");
            }

        }
        System.out.print("]");
        System.out.println();
    }

    public void addFirst(int element) {
        if (isFull()) {
            System.out.println("array is full!");
        } else {
            for (int i = size; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = element;
            size++;
        }
    }

    public void addIn(int i, int element) {
        if (isFull()) {
            System.out.println("array is full!");
        } else {
            if (i >= 0 && i <= size) {
                for (int j = size; j > i; j--) {
                    A[j] = A[j - 1];
                }
                A[i] = element;
                size++;
            } else {
                System.out.println("element index is out of bounds!");
            }
        }
    }

    public void addLast(int element) {
        if (isFull()) {
            System.out.println("array is full!");
        } else {
            A[size] = element;
            size++;
        }
    }

    public void delFirst() {
        if (isEmpty()) {
            System.out.println("Array is empty!");
        } else {
            for (int i = 0; i < size - 1; i++) {
                A[i] = A[i + 1];
            }
            size--;
        }
    }

    public void delIn(int i) {
        if (isEmpty()) {
            System.out.println("Array is empty!");
        } else {
            for (int j = i; j < size - 1; j++) {
                A[j] = A[j + 1];
            }
            size--;
        }
    }

    public void delLast() {
        if (isEmpty()) {
            System.out.println("Array is empty!");
        } else {
            size--;
        }
    }

    public int search(int element) {
        if (isEmpty()) {
            System.out.println("Array is empty!");
        }
        for (int i = 0; i < size; i++) {
            if (A[i] == element) {
                return i;
            }
        }
        return -1;
    }
    
    public void replace(int i, int element){
        int replacedElement = replaceReturn(i,element);
        if(replacedElement==-99){
            System.out.println("Array is Empty!");
        }
        else if(replacedElement==-1){
            System.out.println("index "+i+" is out of bounds!");
            
        }
        else{
        System.out.println("Element "+replacedElement+" was replaced with the new element "+element);
        }
    }

    private int replaceReturn(int i, int element) {
        if (isEmpty()) {
            return -99;
        }
        else {
            if (i >= 0 && i <= size) {
                int temp = A[i];
                A[i] = element;
                return temp;
            } else {
                //index is out of bounds
                return -1;
            }
        }
    }

    public void bubbleSort() {
        if (isEmpty()) {
            System.out.println("Array is empty!");
        } else {
            for (int i = 1; i <= size; i++) {
                for (int j = 0; j < size - i; j++) {
                    if (A[j] > A[j + 1]) {
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                }
            }
        }
    }
    

    public void insert(int element) {
        if (isFull()) {
            System.out.println("Array is full!");
        } else {
            int i;
            for (i = 0; i < size; i++) {
                if (A[i] > element) { // if A[i] = 17; element is 16 ,so the loop stops
                    break;
                }
            }

            for (int j = size; j > i; j--) {
                A[j] = A[j - 1]; // each element is shifted to the right to add the element in it's proper place
            }
            A[i] = element;
            size++;

        }
    }

    private int binarySearchReturn(int element) {
        if (!isEmpty()) {
            int first = 0;
            int last = size - 1;
            int mid;

            while (first <= last) {
                mid = (first + last) / 2;

                if (A[mid] == element) {
                    return mid;
                } else if (A[mid] < element) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

            return -99;
        }
        else {
            return -1;
        }
    }
    
    public void binarySearch(int element) {
        int binarySearch = binarySearchReturn(element);
        
        if (binarySearch == -99) {
            System.out.println("Element " + element + " wasn't found!");
        }
        else if (binarySearch == -1) {
            System.out.println("List is Empty!");
        }
        else {
            System.out.println("Element " + element + " found at index " + binarySearch);
        }
    }

}
