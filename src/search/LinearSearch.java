package search;

/**
 * Class holds logic for - find index of element in array using Linear Search
 * @author Unmesh Chougule
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {0, 25, 12, 5, 11, 10};
        int elementToSearch = 12;
        int indexOFSearchedItem = search(arr, elementToSearch);

        if (indexOFSearchedItem >= 0) {
            System.out.print("Element present at index : "+indexOFSearchedItem);
        } else {
            System.out.print("Element not present in the given array");
        }
    }

    /**
     * Go through every element from array and check if we have the element to be searched
     * @param arr given array
     * @param toFind element to be searched
     * @return index if element found in array else -1 to indicate not found
     */
    public static int search(int[] arr, int toFind) {
        int index = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == toFind) {
                index = i;
            }
        }
        return index;
    }
}
