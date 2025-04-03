
package datastructure;


public class SLLNode {
    private int element;
    SLLNode next;
    SLLNode head;
    
    public SLLNode(){
        element = 0;
        next = null;
        head = null;
    }
    public SLLNode(int element){
        this.element=element;
        next = null;
    }
    public SLLNode(int element, SLLNode next){
        this.element=element;
        this.next = next;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Linked List is Empty!");
        }
        else{
            SLLNode ptr = head;
        
            System.out.print("[");
            while(ptr != null){
                System.out.print(ptr.element);
                if(ptr.next != null){
                    System.out.print(", ");
                }
                ptr = ptr.next;
            }
            System.out.print("]");
            System.out.println();
        }
    }
    
    public void addFirst(int element){
        SLLNode node = new SLLNode(element);
        node.next = head;
        head = node;
    }
    
    public void addLast(int element){
        SLLNode node = new SLLNode(element);
        SLLNode ptr = head;
        
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = node;
    }
    
    public void addIn(int x, int element){
        SLLNode node = new SLLNode(element);
        SLLNode ptr = head;
        
        while(ptr != null){
            if(ptr.element == x){
                break;
            }
            else{
                ptr = ptr.next;
            }
        }
        
        if(ptr == null){
            System.out.println("Element "+x+" isn't found!,");
            System.out.println("the Node with the element "+element+" will be added to the first.");
            addFirst(element);
        }
        else{
            node.next = ptr.next;
            ptr.next = node;
        }
    }
    
    public void delFirst(){
        if(isEmpty()){
            System.out.println("Linked List is Empty!");
        }
        else{
            head = head.next;
        }
    }
    
    public void delLast() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty!");
        }
        else if(head.next == null){
            head = null;
        }
        else{
            SLLNode ptr = head;
            
            while(ptr.next.next !=null){
                ptr = ptr.next;
            }
            ptr.next = null;
        }
        
    
    }
}
