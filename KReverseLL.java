import java.util.*;
public class KReverseLL {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
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
        int k= sc.nextInt();
        slist.kReverse(k);
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
        public void kReverse(int k){
            LL prev= null;

            while(this.size>0){//ye loop n/k times chalra hai
                LL curr = new LL();
                if(this.size>=k){
                    for(int i=0;i<k;i++){//ye loop k bar chalra hai
                        int val= this.getFirst();
                        this.removeFirst();
                        curr.addFirst(val); 
                }}
                else{
                    int os= this.size();
                    for(int i=0;i<os;i++){
                        int val=this.getFirst();
                        this.removeFirst();
                        curr.addLast(val);
                    }
                }
            if(prev==null){
                prev=curr;
            }else{
                prev.tail.next=curr.head;
                prev.tail=curr.tail;
                prev.size +=curr.size;

            }

        }
        //time complexity is linear
        this.head=prev.head;
        this.tail=prev.tail;
        this.size=prev.size;
        
    }
}}



