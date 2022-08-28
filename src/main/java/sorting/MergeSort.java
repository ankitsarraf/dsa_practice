package sorting;

import java.util.Arrays;
import java.util.List;
public class MergeSort {
    static void merge(int[] arr, int i, int j, int k) {
        int[] L = new int[j-i+1];
        int[] R = new int[k-j];

        for(int n = 0; n < L.length; n++) {
            L[n] = arr[i+n];
        }
        for(int n = 0; n < R.length; n++) {
            R[n] = arr[j+1+n];
        }

        int m = 0;
        int n = 0;
//        int temp = i;
        while(m < L.length && n < R.length) {
            if(L[m] <= R[n]) {
                arr[i++] = L[m++];
            } else {
                arr[i++] = R[n++];
            }
        }

        while(m < L.length) {
            arr[i++] = L[m++];
        }
        while(n < R.length) {
            arr[i++] = R[n++];
        }
    }

    static void mergeSort(int[] arr, int i, int j) {
        if( i >= j) return;
        int mid = (i+j)/2;
        mergeSort(arr, i, mid);
        mergeSort(arr, mid+1, j);
        merge(arr, i, mid, j);
    }

    public static void main(String...s) {
        int[] arr = {2,5,3,7,8,9,34,56,25,98};
        mergeSort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

}


