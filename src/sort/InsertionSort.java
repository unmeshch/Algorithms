package sort;

import util.ArrayElementsPrinter;

/**
 * Class holds logic for - Insertion sorting algorithm (Stable by nature)
 * @author Unmesh Chougule
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {22, 12, 11, 100, 1000};
        System.out.print("Array Before Sorting :");
        ArrayElementsPrinter.print(arr);

        sort(arr);

        System.out.print("Array After Insertion Sorting :");
        ArrayElementsPrinter.print(arr);
    }

    /**
     * Sorts the given array using insertion sort algorithm
     * @param arr given int array
     */
    public static void sort(int[] arr) {

        for (int i=0; i<arr.length; i++) {

            for (int j=i+1; j>0 && j<arr.length; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    //the sub array is already sorted move to next element instead of iterating through sorted sub array
                    break;
                }
            }
        }
    }
}