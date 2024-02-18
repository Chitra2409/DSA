import java.util.*;
public class OddEvenLL {
    public static void main(String args[]){
        LL slist= new LL();
        slist.addLast(1);    
        slist.addLast(4);    
        slist.addLast(2);    
        slist.addLast(9);
        slist.addLast(8);
        slist.addLast(3);
        slist.addLast(6);
        slist.addLast(5);
        slist.addLast(10);
        slist.display();
        slist.oddEven();
        slist.display();
        

    }
    public static class Node{
        int data;
        Node next;
    }
    public static class LL{
        int size;
        Node head;
        Node tail;

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
        public void oddEven(){
            LL odd= new LL();
            LL even = new LL();

            while(this.size>0){
                int val= this.getFirst();
                this.removeFirst();

                if(val%2==0){
                    even.addLast(val);
                }else{
                    odd.addLast(val);
                }
            }
            if(odd.size>0 && even.size>0){
                odd.tail.next= even.head;
                this.head= odd.head;
                this.tail=even.tail;
                this.size= odd.size+even.size;
            }else if(odd.size>0){
                this.head= odd.head;
                this.tail=odd.tail;
                this.size= odd.size;

            }else if(even.size>0){
                this.head= even.head;
                this.tail=even.tail;
                this.size= even.size;
            }
        }
        
    }
}



