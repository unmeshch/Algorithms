package sort;

/**
 * Class holds logic for - Bubble sorting algorithm (Stable by nature)
 * @author Unmesh Chougule
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Array Before Sorting :");
        printArr(arr);

        sort(arr);

        System.out.print("Array After Bubble Sorting :");
        printArr(arr);
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

    /**
     * Prints elements of given array in space separated format
     * @param arr given int array
     */
    public static void printArr(final int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
