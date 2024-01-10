//when overflow condition -> make a new array double the size of purani array
//copy elements from purani to new array

public class dynamicStack {
    public static void main(String args[]){
        CustomStack s = new CustomStack(3);
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(30);
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("Top element is :" + s.top()); 
        System.out.print("Elements present in stack :"); 
        s.display();
    }
    public static class CustomStack{
        int data[];
        int tos;

        public CustomStack(int cap){
            data = new int[cap];
            tos=-1;
        }

        int size(){
            return tos + 1;
        }

        void display(){
            for(int i=tos;i>=0;i--){
                System.out.print(data[i]+ " ");
            }
            System.out.println();
        }

        void push(int val){
            if(tos==data.length -1){
                //System.out.println("Overflow");
                int ndata[] = new int[data.length*2];   
                for(int i=0;i<data.length;i++){
                    ndata[i]= data[i];
                }  
                data=ndata;
                tos++;
                data[tos]=val;
            }else{
                tos++;
                data[tos] = val;
            }

        }

        int pop(){
            if(tos==-1){
                System.out.println("Underflow");
                return -1;
            }else{
                int val=data[tos];
                tos--;
                return val;
            }
        }

        int top(){
            if(tos==-1){
                System.out.println("Stack Underflow");
                return -1;
            }else{
                return data[tos];
            }
        }
    }
    
}

    

    


    
