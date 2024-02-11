import java.util.*;
public class linkedListToQueueAdapter {
    public static void main(String args[]){
        LLToQueueAdapter lq = new LLToQueueAdapter();

        // Add elements to the queue
        lq.add(10);
        lq.add(20);
        lq.add(30);
        lq.add(40);

        // Display the size of the queue
        System.out.println("Size of the queue: " + lq.size());

        // Display the front element of the queue
        int frontElement = lq.peek();
        System.out.println("Front element of the queue: " + frontElement);

        // Remove elements from the queue
        System.out.println("Removing elements from the queue:");
        while (lq.size() > 0) {
            int removedElement = lq.remove();
            System.out.println("Removed element: " + removedElement);
        }

        // Attempting to remove from an empty queue
        int removedElement = lq.remove(); // This should print "Stack underflow"

        // Attempting to peek into an empty queue
        int front = lq.peek(); // This should print "Stack is empty"
    }
        
    
    
    public static class LLToQueueAdapter{
        LinkedList<Integer> list;

        public LLToQueueAdapter(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }
        void add(int val){
            list.addLast(val);
        }
        int remove(){
            if(size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return list.removeFirst();
            }
        }
        int peek(){
            if(size()==0){
                System.out.println("Stack is empty");
                return -1;
            }else{
                return list.getFirst();
            }

        }
    }
    public static class Node {
        int data;
        Node next;
    }
    
    public static class LL {
        Node head;
        Node tail;
        int size;

        public int size(){
            return size;

        }
        public void display(){
            Node temp=head;
            while(temp !=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }
        public void removeFirst(){
            if(size==0){
                System.out.println("List is empty");
            }else if(size==1){
                head=tail=null;
                size=0;

            }else{
                head=head.next;
                size--;
            }
        }

        public int getFirst(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }else{
                return head.data;
            }

        }

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

    }
    
}
