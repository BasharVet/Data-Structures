
package datastructure;


public class DataStructure {

    
    public static void main(String[] args) {
        
        Array a = new Array(6);
        
        System.out.println("*Array:");
        a.addFirst(4);
        a.addIn(1, 61);
        a.addIn(2, 34);
        a.addIn(3, 12);
        a.addLast(38);
        
        a.display();
        
        a.bubbleSort();
        
        System.out.println();
        System.out.println("Bubble sorted Array: ");
        a.display();
        
        
        int element=25;
        System.out.println("\nInserting element "+element);
        a.insert(element);  
        a.display();
        
        System.out.println();
        a.replace(3,9);
        System.out.println("Array after replacing: ");
        a.display();
        
        System.out.println();
        System.out.println("Sorted array after replacing: ");
        a.bubbleSort();
        a.display();
        
        System.out.println("\nBinary Search:");
        a.binarySearch(12);
        a.binarySearch(25);
        a.binarySearch(40);
        System.out.println();
        
        
        System.out.println("*Fixed Front Queue: ");
        FixedFrontQueue ffq = new FixedFrontQueue(5);
        
        System.out.println("Main queue:");
        ffq.enque(3);
        ffq.enque(13);
        ffq.enque(15);
        ffq.enque(19);
        ffq.enque(23);
        ffq.display();
        System.out.println("-");
        System.out.println("Queue after dequeuing:");
        ffq.deque();
        ffq.display();
        System.out.println();
        
        System.out.println("*Stack:");
        StackArr sa1 = new StackArr(5);
        StackArr sa2 = new StackArr(5);
        StackArr temp = new StackArr(5);
        
        sa1.push(3);
        sa1.push(4);
        sa1.push(5);
        sa1.push(7);
        sa1.push(9);
        
        System.out.println("\nCopying stack using three stacks:\nbefore copying:");
        System.out.println("\nstack No.1 top element: "+sa1.peak());
        System.out.println("temp stack top element: "+temp.peak());
        while(!sa1.isEmpty()){
            temp.push(sa1.pop());
        }
        System.out.println("\nafter copying: ");
        System.out.println("stack No.1 top element: "+sa1.peak());
        System.out.println("temp stack top element: "+temp.peak());
        
        while(!temp.isEmpty()){
            int x = temp.pop();// pop the "temp" stack elements and push them into stack 1&2
            sa1.push(x);
            sa2.push(x);
        }
        
        System.out.println("\nstack No.1 top element: "+sa1.peak());
        System.out.println("stack No.2 top element: "+sa2.peak());
        
        
        System.out.println();
        System.out.println("*Queue: ");
        QueueArr qa = new QueueArr(5);
        qa.enque(3);
        qa.enque(7);
        qa.enque(9);
        qa.enque(11);
        qa.enque(13);
        System.out.println("Queue length: "+qa.length());
        qa.deque();
        qa.enque(56);
        System.out.println();
        
        System.out.println("*Circular Queue: ");
        CirQueue cq = new CirQueue(5);
        cq.enque(5);
        cq.enque(7);
        cq.enque(9);
        cq.enque(11);
        cq.enque(13);
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println();
        
        System.out.println("*Linked List: ");
        SLLNode linkedList = new SLLNode();
        linkedList.addFirst(33);
        linkedList.addFirst(47);
        linkedList.addFirst(52);
        linkedList.addLast(64);
        linkedList.addIn(23,2);
        linkedList.display();
        
        linkedList.delFirst();
        linkedList.display();
        
        linkedList.delLast();
        linkedList.display();
        
        linkedList.delLast();
        linkedList.display();
        
    }
}
