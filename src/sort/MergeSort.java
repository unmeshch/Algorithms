package sort;

import util.ArrayElementsPrinter;

/**
 * Class holds logic for - Merge sorting algorithm (Stable by nature)
 * This is also an example of divide and conquer strategy i.e. divide array recursively and sort then merge those
 * @author Unmesh Chougule
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Array Before Sorting :");
        ArrayElementsPrinter.print(arr);

        sort(arr, 0, arr.length-1);

        System.out.print("Array After Merge Sorting :");
        ArrayElementsPrinter.print(arr);
    }

    /**
     * Sorts the given array using merge sort algorithm
     * @param arr given int array
     */
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left+right)/2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    /**
     * Merges two sorted arrays
     */
    public static void merge(int[] arr, int left, int mid, int right) {

    }
}