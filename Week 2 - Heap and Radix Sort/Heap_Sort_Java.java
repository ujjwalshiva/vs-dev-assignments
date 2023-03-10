import java.util.*;
import java.lang.*;
import java.io.*;

public class Heap_Sort_Java {
    public static void heapify(int[] arr, int n, int i) {
        int max_val = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left<n && arr[left]>arr[max_val]) {
            max_val = left;
        }

        if (right<n && arr[right]>arr[max_val]) {
            max_val = right;
        }

        if (max_val != i) {
            int i_val = arr[i];
            arr[i] = arr[max_val];
            arr[max_val] = i_val;
            heapify(arr, n, max_val);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        for (int i = n/2-1; i>=0; i--) {
            heapify(arr, n, i);
        }

        for (int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        heapSort(arr);
        System.out.println("Sorted Array using Heap Sort:");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
