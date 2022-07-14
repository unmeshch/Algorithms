package sort;

import util.ElementsPrinter;

/**
 * Class holds logic for - Merge sorting algorithm (Stable by nature)
 * This is also an example of divide and conquer strategy i.e. divide array recursively and sort then merge those
 * @author Unmesh Chougule
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 50};
        System.out.print("Array Before Sorting :");
        ElementsPrinter.print(arr);

        sort(arr, 0, arr.length-1);

        System.out.print("Array After Merge Sorting :");
        ElementsPrinter.print(arr);
    }

    /**
     * Sorts the given array using merge sort algorithm
     * @param arr given int array
     * @param left index from where first sub array will start from original array
     * @param right index where second sub array will end
     */
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left+right)/2;
        sort(arr, left, mid);
        sort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    /**
     * Merges two sorted arrays to get one sorted array
     * @param arr original array
     * @param start1 starting index of first sorted sub array
     * @param end1 mid index (end index of first sorted sub array)
     * @param end2 end index for second sorted sub array
     */
    public static void merge(int[] arr, int start1, int end1, int end2) {
        int start2 = end1+1;
        int length2 = (end2-start2) + 1;
        int length1 = (end1-start1) + 1;
        int[] tempArr = new int[length1 + length2]; // to hold two merged array

        int countToFillTempArray = 0;
        int counterLeft = start1;
        int counterRight = start2;

        //in our case we are calculating middle index such that the second sub array will be always smaller or equal to first
        //if this case is not known, we will have to check which array is smaller and iterate as per it's length
        while (counterLeft<=end1 && counterRight<=end2) {
            //compare both element and increment index when we add the element to temp array
            if (arr[counterLeft] >= arr[counterRight]) {
                tempArr[countToFillTempArray] = arr[counterRight];
                counterRight++;
            } else {
                tempArr[countToFillTempArray] = arr[counterLeft];
                counterLeft++;
            }
            countToFillTempArray++;
        }

        //if first array still has any remaining array then add them to temp array
        while (counterLeft <= end1) {
            tempArr[countToFillTempArray] = arr[counterLeft];
            counterLeft++;
            countToFillTempArray++;
        }

        //if second array still has any remaining array then add them to temp array
        while (counterRight <= end2) {
            tempArr[countToFillTempArray] = arr[counterRight];
            counterRight++;
            countToFillTempArray++;
        }

        //fill two merged arrays into main array
        for (int element : tempArr) {
            arr[start1] = element;
            start1++;
        }
    }
}