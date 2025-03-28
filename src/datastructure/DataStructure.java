
package datastructure;


public class DataStructure {

    
    public static void main(String[] args) {
        
        FixedFrontQueue ffq = new FixedFrontQueue(5);
        
        ffq.enque(3);
        ffq.enque(13);
        ffq.enque(15);
        ffq.enque(19);
        ffq.enque(23);
        ffq.display();
        System.out.println("-");
        ffq.deque();
        ffq.display();
        
        // by Bashar
//        Array a = new Array(6);
//        
//        StackArr sa1 = new StackArr(5);
//        StackArr sa2 = new StackArr(5);
//        StackArr temp = new StackArr(5);
//        
//        QueueArr qa = new QueueArr(5);
//        
//        CirQueue cq = new CirQueue(5);
//        
//        SLLNode linkedList = new SLLNode();
//        linkedList.addFirst(33);
//        linkedList.addFirst(47);
//        linkedList.addFirst(52);
//        linkedList.addLast(64);
//        linkedList.addIn(23,2);
//        linkedList.display();
//        
//        linkedList.delFirst();
//        linkedList.display();
//        
//        linkedList.delLast();
//        linkedList.display();
//        
//        linkedList.delLast();
//        linkedList.display();
        
//        SLLNode head = new SLLNode();
//        System.out.println(head.element);
//        System.out.println(head.next);
//        
//        System.out.println();
//        SLLNode node1 = new SLLNode(5);
//        head.next=node1;
//        System.out.println(node1.element);
//        System.out.println(node1.next);
//        
//        System.out.println();
//        SLLNode node2 = new SLLNode(8,node1);
//        node1.next=node2;
//        System.out.println(node2.element);
//        System.out.println(node2.next);
//        
//        System.out.println("head pointer -> "+head);
//        System.out.println();
//        System.out.println("head-next(node1) pointer -> "+head.next);
//        System.out.println("node1 pointer -> "+node1);
//        System.out.println();
//        System.out.println("node1-next(node2) pointer -> "+node1.next);
//        System.out.println("node2 pointer -> "+node2);
//        System.out.println("node2-next(node1) pointer -> "+node2.next);
        
        
        
        /*
        sa1.push(3);
        sa1.push(4);
        sa1.push(5);
        sa1.push(7);
        
        while(!sa1.isEmpty()){
            temp.push(sa1.pop());
        }
        System.out.println(sa1.peak());
        System.out.println(temp.peak());
        
        while(!temp.isEmpty()){
            int x = temp.pop();
            sa1.push(x);
            sa2.push(x);
        }
        
        System.out.println();
        System.out.println(sa1.peak());
        System.out.println(sa2.peak());*/
        
        /*cq.enque(5);
        cq.enque(7);
        cq.enque(9);
        cq.enque(11);
        cq.enque(13);
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        System.out.println("the dequeued element is: "+cq.deque());
        /*
        
        
        
        
        
        
        
        
        
        
        /*
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
                
        */
    }
}
