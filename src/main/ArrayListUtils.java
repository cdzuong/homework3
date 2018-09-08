package main;

import java.util.ArrayList;

/** Class ArrayListUtils contains several useful methods for working
 *  with ArrayLists. You are not allowed to use any built-in methods
 *  from class ArrayList in this homework, except for add, get, set, size.
 *  You are not allowed to use extra arrays, or any other data structures
 *  such as HashMaps. You may not use classes Arrays and Collections.
 */
public class ArrayListUtils {

    /**
     * Returns the mean ("average") of the list of numbers.
     * @param numbers ArrayList of integers
     * @return the average (mean) of all numbers in the list
     */
    public static double computeMean(ArrayList<Integer> numbers) {
        double mean = 0;
        // FILL IN CODE

        return mean;
    }

    /**
     * Returns the index of the last occurrence of elem in ArrayList arr,
     * or -1, if it is not in the ArrayList. You may not use any methods of
     * class ArrayList apart from add, get, size!
     * @param arr ArrayList
     * @param elem element (integer)
     * @return the index of the last occurrence of elem in arr
     */
    public static int lastIndexOfElem(ArrayList<Integer> arr, int elem) {
        int indexLast = -1;
        // FILL IN CODE

        return indexLast;
    }

    /**
     * Reverses a given ArrayList. Note: you are not
     * allowed to use extra array, ArrayList etc.
     * @param arr reversed ArrayList
     */
    public static void reverse(ArrayList<Integer> arr) {
        // FILL IN CODE

    }


    /**
     * Takes an ArrayList of Integers as a parameter,
     * and returns a new ArrayList that contains all unique elements
     * of the input list (contains no duplicates).
     * @param list input ArrayList that may contain duplicates
     * @return ArrayList without duplicates
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        // FILL IN CODE:

        return res;
    }

    /**
     * Takes two sorted ArrayLists arr1 and arr2 without duplicates
     * and merges them into one sorted ArrayList.
     * Example: arr1 = 5, 10, 15; arr2 = 1, 7, 9, 10, 19. The result should be:
     * 1, 5, 7, 9, 10, 10, 15, 19
     * @param arr1 sorted ArrayList
     * @param arr2 sorted ArrayList
     * @return sorted ArrayList that contains elements from arr1 and arr2
     */
    public static ArrayList<Integer> mergeSortedArrayLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList();
        // FILL IN CODE


        return res;
    }

    /**
     * Takes a 2D ArrayList (ArrayList of ArrayLists of integers) and
     * places all of its elements into a one dimensional ArrayList of integer,
     * row by row.
     * @param matrix ArrayList of ArrayLists of Integers
     * @return one dimensional ArrayList of elements
     */
    public static ArrayList<Integer> convertTo1D(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> res = new ArrayList();
        // FILL IN CODE

        return res;
    }
}
