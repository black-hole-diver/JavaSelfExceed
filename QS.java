import java.io.*;
import java.util.*;

public class QS {
    static void swap(int arr[], int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int arr[], int p, int r){
        Random rand = new Random();
        int i = rand.nextInt((r - p) + 1) + p;

        swap(arr, i, r);
        int k = (p - 1);

        for (int j = 0; j < r; j++){
            if (arr[j] < arr[r]){
                k++;
                swap(arr, k, j);
            }
        }

        swap(arr, k+1, r);
        return (k+1);
    }

    static void quicksort(int arr[], int p, int r) {
        if (p < r)
        {
            int q = partition(arr, p, r);
            quicksort(arr, p, q-1);
            quicksort(arr, q+1, r);
        }
    }

    static void printarray(int arr[]){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 7, 8, 9, 1, 55, 5, 8, 19, 2, 34, 20000 };
        printarray(arr);
        quicksort(arr, 0, arr.length-1);
        printarray(arr);


    }
}
