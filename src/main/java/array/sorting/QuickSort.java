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
//    taking first element as pivot
//    private static int partition(int[] arr, int init, int last) {
//        int pivotIndex = init; // taking first element as pivot
//        int pivot = arr[pivotIndex];
//        int pointerToSmallestInRange = init;
//        // gathering all the number which is lesser than pivot at left hand
//        for(int i = init+1; i <= last; i++) {
//            if(arr[i] < pivot) {
//                pointerToSmallestInRange++;
//                swap(arr, pointerToSmallestInRange, i);
//            }
//        }
//        swap(arr, pivotIndex, pointerToSmallestInRange);
//        // now pivot will be swaped with the last gathered number. So now pivot will be in place
////        System.err.println(pivot + " " + pointerToSmallestInRange + "-> "+Arrays.stream(arr).boxed().collect(Collectors.toList()));
//        return pointerToSmallestInRange;
//    }

    //    taking last element as pivot
    private static int partition(int[] arr, int init, int last) {
        int pivotIndex = last; // taking first element as pivot
        int pivot = arr[pivotIndex];
        int pointerToSmallestInRange = init-1;
        // gathering all the number which is lesser than pivot at left hand
        for(int i = init; i < last; i++) {
            if(arr[i] < pivot) {
                pointerToSmallestInRange++;
                swap(arr, pointerToSmallestInRange, i);
            }
        }
        // As pivot is last element. Now it will be swapped with the next to last small gathered number. So now pivot will be in place
        swap(arr, pivotIndex, ++pointerToSmallestInRange);
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
