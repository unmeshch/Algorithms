package sort;

import util.ArrayElementsPrinter;

/**
 * Class holds logic for - Bubble sorting algorithm (Stable by nature)
 * @author Unmesh Chougule
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Array Before Sorting :");
        ArrayElementsPrinter.print(arr);

        sort(arr);

        System.out.print("Array After Bubble Sorting :");
        ArrayElementsPrinter.print(arr);
    }

    /**
     * Sorts the given array using bubble sort algorithm
     * @param arr given int array
     */
    public static void sort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            boolean didWeSwap = false;

            for (int j=0; j<arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didWeSwap = true;
                }
            }

            //No swapping occurred, array is already sorted, do not perform any more iterations
            if (!didWeSwap) {
                break;
            }
        }
    }
}
