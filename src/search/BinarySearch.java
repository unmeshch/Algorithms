package search;

import java.util.Arrays;

/**
 * Class holds logic for - search index of element in a sorted array using Binary Search
 * @author Unmesh Chougule
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0, 5, 9, 11, 12, 25, 31, 44, 60};
        System.out.println("Search index using in built method in java : "+Arrays.binarySearch(arr, 12));
        int elementToSearch = 12;
        int indexOFSearchedItem = search(arr, elementToSearch);

        if (indexOFSearchedItem >= 0) {
            System.out.print("Search index using custom logic : "+indexOFSearchedItem);
        } else {
            System.out.print("Element not present in the given array");
        }
    }

    /**
     *
     * @param arr given array
     * @param toFind element to be searched
     * @return index if element found in array else -1 to indicate not found or empty array
     */
    public static int search(int[] arr, int toFind) {
        int index = -1;
        if (arr.length == 0) { //if empty array return -1
            return index;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int midIndex = start + (end-start) / 2;

            if (arr[midIndex] == toFind) { //if at middle
                return midIndex;
            }

            if (arr[midIndex] < toFind) { //if at right-hand side
                start = midIndex+1;
            } else { //if at left-hand side
                end = midIndex-1;
            }
        }

        return index;
    }
}
