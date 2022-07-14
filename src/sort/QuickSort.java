package sort;

import util.ElementsPrinter;

/**
 * Class holds logic for - Quick sorting algorithm (Not stable by nature)
 * @author Unmesh Chougule
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {0, 25, 12, 5, 11, 10};

        System.out.print("Array Before Sorting :");
        ElementsPrinter.print(arr);

        sort(arr, 0, arr.length-1);

        System.out.print("Array After Quick Sorting :");
        ElementsPrinter.print(arr);
    }

    /**
     * Sorts the given array using quick sort algorithm - uses last element as pivot point
     * @param arr given int array
     * @param left start index
     * @param right end index
     */
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivotIdx = partitionIt(arr, left, right);

        sort(arr, left, pivotIdx-1);
        sort(arr, pivotIdx+1, right);
    }

    /**
     * Partition the array such that elements on left side of pivot are smaller and on right side are larger than the pivot
     * @param arr array to be partitioned
     * @param left start index
     * @param right end index
     * @return final position of the pivot element in given array
     */
    public static int partitionIt(int[] arr, int left, int right) {
        int i = left-1; //starting below start index
        int pivot = arr[right];
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        //all elements swapped, move pivot to its final position
        i++;
        swap(arr, i, right);
        return i;
    }

    /**
     * Another way to partition, uses two pointers traversing from opposite ends and swapping elements
     * @param arr array to be partitioned
     * @param left start index
     * @param right end index
     * @return final position of the pivot element in given array
     */
    public static int partitionItAnotherWay(int[] arr, int left, int right)
    {
        int leftPtr = left-1; // left (after ++)
        int rightPtr = right; // right-1 (after --)
        int pivot = arr[right];
        while(true)
        {   // find bigger item
            while( arr[++leftPtr] < pivot )
                ; // (nop)
            // find smaller item
            while(rightPtr > 0 && arr[--rightPtr] > pivot)
                ; // (nop)
            if(leftPtr >= rightPtr) { // if pointers cross,
                break; // partition done
            }
            else // not crossed, so
                swap(arr, leftPtr, rightPtr); // swap elements
        }

        swap(arr, leftPtr, right); // restore pivot
        return leftPtr; // return pivot location
    }

    public static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
