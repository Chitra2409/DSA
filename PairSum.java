public class PairSum {
    public static int findPairs(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 7, 8, 9};
        int k = 10;
        System.out.println("Number of pairs: " + findPairs(arr, k));
    }
}
