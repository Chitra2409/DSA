import java.util.*;
public class linkedListToStackAdapter {
    public static void main(String args[]){
        LLToStackAdapter ls = new LLToStackAdapter();
        
        // Push elements onto the stack
        ls.push(10);
        ls.push(20);
        ls.push(30);
        ls.push(40);

        // Display the size of the stack
        System.out.println("Size of the stack: " + ls.size());

        // Display the top element of the stack
        int topElement = ls.top();
        System.out.println("Top element of the stack: " + topElement);

        // Pop elements from the stack
        System.out.println("Popping elements from the stack:");
        while (ls.size() > 0) {
            int poppedElement = ls.pop();
            System.out.println("Popped element: " + poppedElement);
        }

        // Attempting to pop from an empty stack
        int poppedElement = ls.pop(); // This should print "Stack underflow"

        // Attempting to get the top element from an empty stack
        int top = ls.top(); // This should print "Stack is empty"
    
        
    }
    
    public static class LLToStackAdapter{
        LinkedList<Integer> list;

        public LLToStackAdapter(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }
        void push(int val){
            list.addFirst(val);
        }
        int pop(){
            if(size()==0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return list.removeFirst();
            }
        }
        int top(){
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

        public void addFirst(int val){
            Node temp= new Node();
            temp.data= val;
            temp.next= head;
            head=temp;

            if(size==0){
                tail=temp;
            }
            size++;
        }

    }
    
}
