import java.util.*;
public class mergeTwoSortedLinkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        LL list1= new LL();
        int n= sc.nextInt();
        for(int i = 0;i<n;i++){
            int val= sc.nextInt();
            list1.addLast(val);
        }
        LL list2= new LL();
        n= sc.nextInt();
        for(int i = 0;i<n;i++){
            int val= sc.nextInt();
            list2.addLast(val);
        }

        LL resultList = mergeTwoSortedLists(list1, list2);
        resultList.display();


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

    public static void testList(LL list) {
        Node temp = list.head;

        System.out.println("Size: " + list.size);

        if (list.size > 0) {
            System.out.println("Tail Data: " + list.tail.data);
        }
    }
    
}
