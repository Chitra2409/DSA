//till now we have been using the built in stack but now we will code it.
//basically this is stack implementation using array
import java.util.*;
public class normalStack {
    public static void main(String args[]){
        CustomStack s = new CustomStack(3);
        s.push(10); 
        s.push(20); 
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
                System.out.println("Overflow");
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


    
