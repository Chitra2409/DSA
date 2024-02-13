//without using the size property 
//giving the solution iteratively
//calculating in single traversal
import java.util.*;
public class KthNodeFromEnd {
    public static void main(String args[]){
        LinkedList ls= new LinkedList();
        ls.addLast(10);
        ls.addLast(20);
        ls.addLast(30);
        ls.addLast(40);
        ls.addLast(50);
        ls.addLast(60);
        ls.display();
        int kth = ls.kthFromLast(2);
        System.out.println(kth);

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
        
        public int kthFromLast(int k){
            Node s= head;
            Node f= head;
            for(int i=0;i<k;i++){
                f=f.next;   
            }
            while(f!=tail){
                s=s.next;
                f=f.next;
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
