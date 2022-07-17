package search;

/**
 * Class holds logic for - search index of element in a sorted array using Jump Search
 * This is more optimized than linear search as we skip few elements in search
 * @author Unmesh Chougule
 */
public class JumpSearch {

    public static void main(String[] args) {
        int[] arr = {0, 5, 9, 11, 12, 25, 31, 44, 60, 77, 89, 100, 101};
        int elementToSearch = 100;
        int jumpSize = (int)Math.sqrt(arr.length); //optimal jump size
        int indexOFSearchedItem = search(arr, elementToSearch, jumpSize);

        if (indexOFSearchedItem >= 0) {
            System.out.print("Element present at index : " + indexOFSearchedItem);
        } else {
            System.out.print("Element not present in the given array");
        }
    }

    /**
     *
     * @param arr given array
     * @param toFind element to be searched
     * @param jumpSize size of the jump
     * @return index if element found in array else -1 to indicate not found or empty array
     */
    public static int search(int[] arr, int toFind, int jumpSize) {
        int index = -1;

        if (arr.length == 0) { //empty array
            return index;
        }

        //1, 2, 3, 4
        int prevJumped = 0;
        int jumpedIndex = prevJumped + jumpSize;
        while (prevJumped < arr.length && arr[prevJumped] < toFind) {
            if (jumpedIndex >= arr.length || arr[jumpedIndex] > toFind) { //do not want prevJump to go out if array limits or go beyond element to find
                break;
            }
            prevJumped = jumpedIndex;
            jumpedIndex += jumpSize;
        }

        //linear search from prev jump to next jump
        while (prevJumped <= jumpedIndex && prevJumped < arr.length) {
            if (arr[prevJumped] == toFind) {
                index = prevJumped;
                break;
            }
            prevJumped++;
        }

        return index;
    }
}