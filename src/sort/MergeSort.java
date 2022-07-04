package sort;

import util.ArrayElementsPrinter;

/**
 * Class holds logic for - Merge sorting algorithm (Stable by nature)
 * This is also an example of divide and conquer strategy
 * @author Unmesh Chougule
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Array Before Sorting :");
        ArrayElementsPrinter.print(arr);

        sort(arr);

        System.out.print("Array After Merge Sorting :");
        ArrayElementsPrinter.print(arr);
    }

    /**
     * Sorts the given array using merge sort algorithm
     * @param arr given int array
     */
    public static void sort(int[] arr) {
        
    }
}