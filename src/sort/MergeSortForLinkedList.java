package sort;

import util.ElementsPrinter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TODO complete algorithm for linked list similar to array merge sort
/**
 * Class holds logic for - Merge sorting algorithm for linked list (Stable by nature)
 * Same as the Merge sort already implemented, but this one is to sort linked list instead of array
 * @author Unmesh Chougule
 */
public class MergeSortForLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2));

        System.out.print("Array Before Sorting :");
        ElementsPrinter.print(list);

        sort(list, 0, list.size()-1);

        System.out.print("Array After Merge Sorting :");
        ElementsPrinter.print(list);
    }

    //not required, in java we have list.size() method from which we can get middle point directly
    public static int getListMiddle(List<Integer> list) {
        //Use hare and tortoise to find the middle point
        return 0;
    }

    /**
     * Sorts the given array using merge sort algorithm
     * @param list given int array
     * @param left index from where first sub array will start from original array
     * @param right index where second sub array will end
     */
    public static void sort(List<Integer> list, int left, int right) {

    }

    /**
     * Merges two sorted arrays to get one sorted array
     * @param list original array
     * @param start1 starting index of first sorted sub array
     * @param end1 mid index (end index of first sorted sub array)
     * @param end2 end index for second sorted sub array
     */
    public static void merge(List<Integer> list, int start1, int end1, int end2) {

    }
}