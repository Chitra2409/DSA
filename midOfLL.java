//without using the size property 
//giving the solution iteratively
//calculating in single traversal
import java.util.*;
public class midOfLL {
    public static void main(String args[]){
        LinkedList ls= new LinkedList();
        ls.addLast(10);
        ls.addLast(20);
        // ls.addLast(30);
        ls.addLast(40);
        ls.addLast(50);
        ls.addLast(60);
        ls.display();
        int midElement = ls.mid();
        System.out.println(midElement);

    }
    
    public static class Node {
        int data;
        Node next;
    }
    
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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
        
        public int mid(){
            Node s= head;
            Node f = head;

            while(f.next !=null && f.next.next!=null){
                s= s.next;
                f=f.next.next;
            }
            return s.data;

        }

    }
    

    public static void testList(LinkedList list) {
        Node temp = list.head;

        System.out.println("Size: " + list.size);

        if (list.size > 0) {
            System.out.println("Tail Data: " + list.tail.data);
        }
    }
    
    
}
