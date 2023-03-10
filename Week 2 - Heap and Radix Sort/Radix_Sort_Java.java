import java.util.*;
import java.lang.*;
import java.io.*;

class Radix_Sort_Java {
    public static void radixSort( int[] a)    {
        int i, first = a[0], counter = 1, n = a.length;
        int[] b = new int[n];
        for (i = 1; i < n; i++)
            if (a[i] > first)
                first = a[i];
        while (first/counter>0)    {
            int[] output = new int[10];
            for (i = 0; i < n; i++)
                output[(a[i] / counter) % 10]++;
            for (i = 1; i < 10; i++)
                output[i] += output[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--output[(a[i] / counter) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            counter = counter * 10;        
        }
    }    


    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        int n, i;
        System.out.println("Enter n value: ");
        n = scan.nextInt();
        int arr[] = new int[ n ];
        System.out.println("\nEnter "+ n +" elements in array");
        for (i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        radixSort(arr);
        System.out.println("\nSorted Array using Radix Sort: ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();                     
    }    
}