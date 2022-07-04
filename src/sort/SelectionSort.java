package sort;

import util.ArrayElementsPrinter;

/**
 * Class holds logic for - Selection sorting algorithm
 * @author Unmesh Chougule
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Array Before Sorting :");
        ArrayElementsPrinter.print(arr);

        sort(arr);

        System.out.print("Array After Selection Sorting :");
        ArrayElementsPrinter.print(arr);
    }

    /**
     * TODO : Selection sort is not stable by nature, add new stable version of this by considering indexes of the element.
     * Sorts the given array using selection sort algorithm
     * @param arr given int array
     */
    public static void sort(int[] arr) {
        int indexOfMin=0;

        for (int i=0; i<arr.length; i++) {
            indexOfMin = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[indexOfMin] > arr[j]) {
                    indexOfMin = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
    }
}
