
public class LL {
    public static void main(String[] args) throws Exception {
        
        LinkedList slist = new LinkedList();
        slist.addLast(1);    
        slist.addLast(2);    
        slist.addLast(3);    
        slist.addLast(4);
        slist.addFirst(5);
        int first= slist.getFirst();
        System.out.println(first); 
        slist.removeFirst();
        slist.addAt(1, 80);
        slist.display();
        testList(slist);
        slist.removeLast();
        slist.display();
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
        public int getLast(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }else{
                return tail.data;
            }

        }
        public int getAt(int idx){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }else if(idx<0 || idx>=size){
                System.out.println("invalid arguments");
                return -1;
            }else{
                Node temp=head;
                for(int i=0;i<idx;i++){
                    temp=temp.next;

                }
                return temp.data;

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

        public void addAt(int idx, int val){
            
            if(idx<0 || idx>size){
                System.out.println("Invalid index");

            }else if(idx==0){
                addFirst(val);

            }else if(idx==size){
                addLast(val);

            }else{
                Node node = new Node();
                node.data= val;
                Node temp=head;
                for(int i=0; i<idx-1;i++){
                    temp=temp.next;

                }
                node.next=temp.next;
                temp.next=node;
                size++;

            }

        }

        public void removeLast(){
            if(size==0){
                System.out.println("Empty already");
            }else if(size==1){
                head=tail= null;
                size=0;
            }else{
                Node temp=head;
                for(int i =0;i<size-2;i++){
                    temp= temp.next;
                }
                tail=temp;
                temp.next=null;

                size--;
            }
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


            
