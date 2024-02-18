import java.util.*;
public class removeDupInSortedLL {
    public static void main(String args[]){
        LL slist= new LL();
        slist.addLast(1);    
        slist.addLast(1);    
        slist.addLast(2);    
        slist.addLast(2);
        slist.addLast(2);
        slist.addLast(3);
        slist.addLast(4);
        slist.addLast(5);
        slist.addLast(5);
        slist.display();
        slist.duplicateInLL();
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
        public void duplicateInLL(){
            LL resultList= new LL();
            while(this.size()>0){//this is used to refer to the list jisme ye call hua hai
                int val = this.getFirst();
                if(resultList.size==0 || resultList.tail.data !=val){
                    resultList.addLast(val);
                }
                this.removeFirst();
            }
            //the below thing we are doing, kyuki this.removeFirst krte krte vo list empty ho gyi hai
            //to main method me jo second vala display hai usme kuch display na hota agaer ye na karte
            this.head=resultList.head;
            this.tail=resultList.tail;
            this.size=resultList.size;
            //space constant hai kyuki nodes badhe nahi hai
        }
    }
}



