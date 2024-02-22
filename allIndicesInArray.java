package Recursion;
import java.util.Scanner;

public class allIndicesInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int occur[] = allIndices(arr, 0, d, 0);
        // Printing the indices
        for (int i = 0; i < occur.length; i++) {
            System.out.print(occur[i] + " ");
        }
    }

    public static int[] allIndices(int[] arr, int idx, int d, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == d) {
            int[] indices = allIndices(arr, idx + 1, d, fsf + 1);
            indices[fsf] = idx;
            return indices;
        } else {
            return allIndices(arr, idx + 1, d, fsf);
        }
    }
}
