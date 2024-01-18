import java.util.Stack;
import java.util.*;

public class NGETR {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = nextGreaterElements(arr);
        System.out.println("Next Greater Elements to the right:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack until the stack is empty or the top element is greater
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // If the stack is empty, there is no greater element to the right
            // Otherwise, the top element of the stack is the next greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(nums[i]);
        }

        return result;
    }
}
