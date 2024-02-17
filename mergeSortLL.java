import java.util.*;
public class mergeSortLL {
    public static void main(String args[]){
        LL list = new LL();
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        list.addLast(5);
        list.addLast(4);

        // Sorting the linked list using merge sort
        LL sortedList = mergeSort(list.head, list.tail);

        // Displaying the sorted linked list
        System.out.println("Sorted Linked List:");
        sortedList.display();
    }
    public static class Node {
        int data;
        Node next;
    }
    
    public static class LL {
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
    }
    public static Node midNode(Node head, Node tail){
        Node s = head;
        Node f= head;

        while(f!=tail && f.next!=tail){
            s= s.next;
            f=f.next.next;
        }
        return s;
    }
    public static LL mergeTwoSortedLists(LL l1, LL l2){
        Node one = l1.head;
        Node two= l2.head;

        LL res= new LL();
        while(one !=null && two !=null){
            if(one.data<two.data){
                res.addLast(one.data);
                one = one.next;
            }else{
                res.addLast(two.data);
                two=two.next;
            }
        }while(one !=null){
                res.addLast(one.data);
                one = one.next;
        }while(two !=null){
                res.addLast(two.data);
                two=two.next;
            
        }
        return res;
        
    }
    public static LL mergeSort(Node head, Node tail){
        if(head==tail){
            LL br= new LL();
            br.addLast(head.data);
            return br;
        }
        Node mid = midNode(head,tail);
        LL firstSortedhalf= mergeSort(head,mid);
        LL secondSortedHalf= mergeSort(mid.next,tail);
        LL cl = mergeTwoSortedLists(firstSortedhalf,secondSortedHalf);
        return cl;
        
        
    }
    

    public static void testList(LL list) {
        Node temp = list.head;

        System.out.println("Size: " + list.size);

        if (list.size > 0) {
            System.out.println("Tail Data: " + list.tail.data);
        }
    }
}   

