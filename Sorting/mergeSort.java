import java.util.*;

public class mergeSort {
    
    public static void mergeAll(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void merge(int arr[], int l, int r){
        if(l < r){
            int mid = (l + r) / 2;
            merge(arr, l, mid);
            merge(arr, mid + 1, r);
            mergeAll(arr, l, mid, r);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 12, 9, 10, 44, 4, 6, 11};
        int l = 0; 
        int r = arr.length - 1;

        merge(arr, l, r);

       
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

