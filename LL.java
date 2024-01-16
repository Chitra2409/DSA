import java.io.*;

public class LL {
    public static void main(String[] args) throws Exception {
        
        LinkedList slist = new LinkedList();
        slist.addLast(1);    
        slist.addLast(2);    
        slist.addLast(3);    
        slist.addLast(4); 
        
        testList(slist);
        
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
        
    }

    public static void testList(LinkedList list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Size: " + list.size);

        if (list.size > 0) {
            System.out.println("Tail Data: " + list.tail.data);
        }
    }
}
