
package datastructure;


public class DataStructure {

    
    public static void main(String[] args) {
        Array arr = new Array(8);
        arr.addFirst(94);
        arr.addIn(1, 13);
        arr.addIn(2, 55);
        arr.addIn(3, 44);
        arr.addIn(4, 32);
        arr.addLast(72);
        arr.display();
        arr.bubbleSort();
        arr.display();
        arr.binarySearchVoid(44);
        
    }

    public static void insert(int element, int[] array) {
        // if(isFull()){ sout("can't insert");
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] > element) {
                break;
            }
        }
        for (int j = array.length; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = element;
        //size++;
    }
    
}
