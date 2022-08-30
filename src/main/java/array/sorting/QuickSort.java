package array.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSort {

    private static void quickSort(int[] arr, int i, int j) {
        if(i <= j) {
            int partition = partition(arr, i, j);
            quickSort(arr, i, partition - 1);
            quickSort(arr, partition + 1, j);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int init, int last) {
        int pivot = arr[init]; // taking first element as pivot
        int pointerToSmallestInRange = init;
        for(int i = init; i <= last; i++) {
            if(arr[i] < pivot) {
                swap(arr, pointerToSmallestInRange, i);
                pointerToSmallestInRange++;
            }
        }
        System.err.println("-> "+Arrays.stream(arr).boxed().collect(Collectors.toList()));
        return pointerToSmallestInRange;
    }

    public static void main(String...s) {
//        int[] arr = {20,50,3,7,8,9,34,56,25,98};
//        int arr[] = {12, 11, 13, 5, 6, 7, 1};
        int arr[] = {5, 6, 7, 1, 11, 12, 13};
        quickSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}
