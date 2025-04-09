
package datastructure;


public class DataStructure {
    public static final String GREEN = "\u001B[32m";  
    public static final String RED = "\u001B[31m";    
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\033[34m";
    public static final String RESET = "\u001B[0m";

    
    public static void main(String[] args) {
        System.out.println("1- Move from a Queue all its entries onto a Stack*");
        CirQueue queue1 = new CirQueue(5);
        StackArr stack1 = new StackArr(5);
        queue1.enque(14);
        queue1.enque(17);
        queue1.enque(21);
        queue1.enque(25);
        queue1.enque(29);
        System.out.println("Queue List:");
        queue1.display();
        
        
        System.out.println("Queue length "+RED+"BEFORE"+RESET+" moving items onto a stack: "+queue1.length());
        System.out.println("Stack length "+RED+"BEFORE"+RESET+" recieving items from Queue: "+stack1.length());
        System.out.println();
        while(!queue1.isEmpty()){
            int movedItem = queue1.deque();
            stack1.push(movedItem);
            System.out.println("*item "+movedItem+" is moved to stack*");
        }
        
        System.out.println();
        System.out.println("Queue length "+GREEN+"AFTER"+RESET+" moving items onto a stack: "+queue1.length());
        System.out.println("Stack length "+GREEN+"AFTER"+RESET+" recieving items from Queue: "+stack1.length());
        System.out.println("Stack Top element: "+stack1.peak());
        System.out.println("\n");
        
        System.out.println("2- Move from a Stack all its entries into a Queue*");
        StackArr stack2 = new StackArr(5);
        CirQueue queue2 = new CirQueue(5);
        stack2.push(3);
        stack2.push(5);
        stack2.push(7);
        stack2.push(9);
        stack2.push(11);
        System.out.println("Stack length "+RED+"BEFORE"+RESET+" moving items onto a Queue: "+stack2.length());
        System.out.println("Queue length "+RED+"BEFORE"+RESET+" recieving items from Stack: "+queue2.length());
        System.out.println();
        while(!stack2.isEmpty()){
            int movedItem = stack2.pop();
            queue2.enque(movedItem);
            System.out.println("*item "+movedItem+" is moved to queue*");
        }
        
        System.out.println();
        System.out.println("Stack length "+GREEN+"AFTER"+RESET+" moving items onto a Queue: "+stack2.length());
        System.out.println("Queue length "+GREEN+"AFTER"+RESET+" recieving items from Stack: "+queue2.length());
        System.out.println("Queue Elements after moving: ");
        queue2.display();
        
        System.out.println();
        System.out.println("3- Use a temporary Stack to reverse the order of the entries of a Queue.");
        StackArr tempStack = new StackArr(5);
        CirQueue queue3 = new CirQueue(5);
        
        queue3.enque(2);
        queue3.enque(4);
        queue3.enque(6);
        queue3.enque(8);
        queue3.enque(10);
        System.out.println("Queue "+RED+"BEFORE"+RESET+" reversing the order of elements: ");
        queue3.display();
        
        System.out.println("\nMoving the Elements to the Temporary stack");
        while(!queue3.isEmpty()){
            int movedItem = queue3.deque();
            tempStack.push(movedItem);
            System.out.println("item "+movedItem+" moved to stack*");
        }
        System.out.println("\nReturning back the elements back to the Original Queue*");
        
        while(!tempStack.isEmpty()){
            int movedItem = tempStack.pop();
            queue3.enque(movedItem);
            System.out.println("item "+movedItem+" moved to Queue*");
        }
        
        System.out.println("\nAll elements are moved to the Queue*");
        System.out.println("Queue "+GREEN+"AFTER"+RESET+" reversing the order of elements: ");
        queue3.display();
        
        
        System.out.println("\n4- Empty one Stack (S1) onto the top of another Stack (S2) in such a way");
        System.out.println("that the entries that were in (S1) Stack keep the same order.\n");
        StackArr stack3 = new StackArr(5);
        StackArr tempStack2 = new StackArr(5);
        StackArr stack4 = new StackArr(5);
        stack3.push(3);
        stack3.push(5);
        stack3.push(7);
        stack3.push(9);
        stack3.push(11);
        
        System.out.println("Top element For "+YELLOW+"S1"+RESET+": "+stack3.peak());
        
        System.out.println("\nMoving items from "+YELLOW+"Stack S1"+RESET+" to Temp Stack*\n");
        
        while(!stack3.isEmpty()){
            int movedItem = stack3.pop();
            tempStack2.push(movedItem);
            System.out.println("item "+movedItem+" is moved to Temp Stack");
        }
        System.out.println("\nNow move the items to S2*\n");
        while(!tempStack2.isEmpty()){
           int movedItem = tempStack2.pop();
            stack4.push(movedItem);
            System.out.println("item "+movedItem+" is moved to Stack S2"); 
        }
        
        System.out.println("\nTop element For "+YELLOW+"S2"+RESET+": "+stack4.peak());
        
        
        
        System.out.println("\n5- Use a temporary Queue to reverse the order of the entries of a Stack");
        StackArr stack5 = new StackArr(5);
        CirQueue queue4 = new CirQueue(5);
        stack5.push(5);
        stack5.push(10);
        stack5.push(15);
        stack5.push(20);
        stack5.push(25);
        
        System.out.println("\nStack Top Element: "+stack5.peak());
        System.out.println(BLUE+"Reversing......"+RESET);
        while(!stack5.isEmpty()){
            queue4.enque(stack5.pop());
        }
        while(!queue4.isEmpty()){
            stack5.push(queue4.deque());
        }
        System.out.println("Stack Top Element: "+stack5.peak());
        
        System.out.println("\n6- Empty one Stack (S1) onto the top of another Stack (S2) in such a way\nthat the entries that were in (S1) Stack are in the reverse of their original order.");
        StackArr stack6 = new StackArr(5);
        StackArr stack7 = new StackArr(5);
        stack6.push(4);
        stack6.push(8);
        stack6.push(12);
        stack6.push(16);
        stack6.push(20);
        System.out.println("\nStack S1 Length: "+stack6.length());
        System.out.println("Stack S1 Top Element: "+stack6.peak());
        System.out.println("\n"+BLUE+"Copying items to Stack S2....."+RESET);
        while(!stack6.isEmpty()){
            stack7.push(stack6.pop());
        }
        System.out.println("\nStack S1 Length: "+stack6.length());
        System.out.println("Stack S1 Top Element: "+stack6.peak());
        System.out.println("Stack S2 Length: "+stack7.length());
        System.out.println("Stack S2 Top Element: "+stack7.peak());
        
        
        Array a = new Array(6);
        Array test = new Array(9);
        test.addFirst(4);
        test.addFirst(5);
        test.addFirst(3);
        test.addFirst(4);
        test.addFirst(3);
        test.addFirst(5);
        test.addFirst(4);
        test.addFirst(5);
        test.addFirst(6);
        test.display();
        test.bubbleSort();
        test.display();
        test.removeDuplicates();
        test.display();
        
        
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
        
        System.out.println("\nCopying stack1 using three stacks:\nbefore copying:");
        System.out.println("\nstack No.1 top element: "+sa1.peak());
        System.out.println("temp stack1 top element: "+temp.peak());
        while(!sa1.isEmpty()){
            temp.push(sa1.pop());
        }
        System.out.println("\nafter copying: ");
        System.out.println("stack1 No.1 top element: "+sa1.peak());
        System.out.println("temp stack1 top element: "+temp.peak());
        
        while(!temp.isEmpty()){
            int x = temp.pop();// pop the "temp" stack1 elements and push them into stack1 1&2
            sa1.push(x);
            sa2.push(x);
        }
        
        System.out.println("\nstack No.1 top element: "+sa1.peak());
        System.out.println("stack1 No.2 top element: "+sa2.peak());
        
        
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
