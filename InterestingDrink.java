//codeforces-706B
import java.util.*;

public class InterestingDrink {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int count = upperBound(arr1, x);
            System.out.print(count + " ");
        }
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
