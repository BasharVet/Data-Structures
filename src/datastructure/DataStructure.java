
package datastructure;


public class DataStructure {

    
    public static void main(String[] args) {
        Array a = new Array(6);
                
        StackArr sa = new StackArr(5);
        
        QueueArr qa = new QueueArr(5);
        
        System.out.println("*Array:");
        a.addFirst(4);
        a.addIn(1, 61);
        a.addIn(2, 34);
        a.addIn(3, 12);
        a.addLast(38);
        a.addFirst(25);
        
        a.display();
        
        a.bubbleSort();
        System.out.println();
        System.out.println("Bubble sorted Array: ");
        a.display();
        
        System.out.println();
        a.replace(4,18);
        System.out.println("Array after replacing: ");
        a.display();
        
        System.out.println();
        System.out.println("Sorted array after replacing: ");
        a.bubbleSort();
        a.display();
        
        System.out.println();
        a.binarySearch(12);
        a.binarySearch(25);
        a.binarySearch(40);
        
        System.out.println();
        System.out.println("*Queue: ");
        qa.enque(3);
        qa.enque(7);
        qa.enque(9);
        qa.enque(11);
        qa.enque(13);
        System.out.println("Queue length: "+qa.length());
        qa.deque();
        qa.enque(56);
        
        System.out.println();
        System.out.println("*Stack: ");
        sa.push(4);
        sa.push(6);
        sa.push(9);
        sa.push(21);
        sa.push(37);
        sa.peak();
        sa.pop();
        sa.peak();
                
        
    }
}
