import java.io.*;
import java.util.*;

class Quicksort{
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int arr[], int low, int high){

        Random rand = new Random();
        int i = rand.nextInt((high - low) + 1) + low;
        swap(arr, i, high);

        int k = (low - 1);

        for (int j = low; j < high; j++){
            if (arr[j] < arr[high]){
                k++;
                swap(arr, k, j);
            }
        }
        swap(arr, k+1, high);
        return (k+1);
    }

    static void qs(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            qs(arr, low, pi-1);
            qs(arr,pi+1, high);
        }
    }

    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
            
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5, 55, 8, 19, 2 };
        
        printArray(arr);
        qs(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}