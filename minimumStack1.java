//Space is not constant in this
//because we are making use of two stacks

import java.util.*;
public class minimumStack1 {
    public static void main(String args[]){
        MinStack stack = new MinStack();

        // Pushing elements onto the stack
        stack.push(3);
        stack.push(5);
        System.out.println("Current minimum: " + stack.min()); // Should print 3
        stack.push(2);
        System.out.println("Top element: " + stack.top()); // Should print 2
        System.out.println("Current minimum: " + stack.min()); // Should print 2

        // Popping elements from the stack
        System.out.println(stack.pop() + " Popped from stack"); // Should print "2 Popped from stack"
        System.out.println("Top element: " + stack.top()); // Should print 5
        System.out.println("Current minimum: " + stack.min()); // Should print 3

    }
    public static class MinStack{
        Stack<Integer> allData;
        Stack<Integer> minData;

        public MinStack(){
            allData = new Stack<>();
            minData = new Stack<>();
        }
    
    int size(){
        return allData.size();
    }
    void push(int val){
        allData.push(val);
        if(minData.size()==0 || val <=minData.peek()){
            minData.push(val);
        }
    }
    int pop(){
        if(size()==0){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            int val = allData.pop();
            if(val==minData.peek()){
                minData.pop();
            }
            return val;
        } 

    }
    int top(){
        if(size()==0){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            return allData.peek();
        } 

    }
    int min(){
        if(size()==0){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            return minData.peek();
        } 
    }
}   
}
