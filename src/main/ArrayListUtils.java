package main;

import java.util.ArrayList;

/**
 * Class ArrayListUtils contains several useful methods for working
 * with ArrayLists. You are not allowed to use any built-in methods
 * from class ArrayList in this homework, except for add, get, set, size.
 * You are not allowed to use extra arrays, or any other data structures
 * such as HashMaps. You may not use classes Arrays and Collections.
 */
public class ArrayListUtils {

    /**
     * Returns the mean ("average") of the list of numbers.
     *
     * @param numbers ArrayList of integers
     * @return the average (mean) of all numbers in the list
     */
    public static double computeMean(ArrayList<Integer> numbers) {
        double mean = 0;
        // FILL IN CODE

        int i;
        double sum = 0;
        if (numbers.size() == 0) {
            mean = 0;
        } else {
            for (i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }

            mean = sum / numbers.size();
        }

        return mean;
    }

    /**
     * Returns the index of the last occurrence of elem in ArrayList arr,
     * or -1, if it is not in the ArrayList. You may not use any methods of
     * class ArrayList apart from add, get, size!
     *
     * @param arr  ArrayList
     * @param elem element (integer)
     * @return the index of the last occurrence of elem in arr
     */
    public static int lastIndexOfElem(ArrayList<Integer> arr, int elem) {
        int indexLast = -1;
        // FILL IN CODE

        // for loop to search
        // if statement for int elem present

        int j;
        for (j = 0; j < arr.size(); j++) {
            if (arr.get(j) == elem) {
                indexLast = j;
            }
        }


        return indexLast;
    }

    /**
     * Reverses a given ArrayList. Note: you are not
     * allowed to use extra array, ArrayList etc.
     *
     * @param arr reversed ArrayList
     */
    public static void reverse(ArrayList<Integer> arr) {
        // FILL IN CODE

        // reassign indices by taking the highest and filling it in first.
        // need a for loop that runs backwards
        int j;
        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() / 2) {
                j = arr.get(i);
                arr.set(i, arr.get(arr.size() - 1 - i));
                arr.set(arr.size() - i - 1, j);
            }
        }

    }


    /**
     * Takes an ArrayList of Integers as a parameter,
     * and returns a new ArrayList that contains all unique elements
     * of the input list (contains no duplicates).
     *
     * @param list input ArrayList that may contain duplicates
     * @return ArrayList without duplicates
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> res = new ArrayList<>();
        // FILL IN CODE:

        // check each index element for duplicates (for loop)
        // only add if didn't encounter yet.


        res.add(list.get(0));
        int i = 0;

        while (i < list.size()) {

            for (int k = 0; k < res.size(); k++) {

                if (list.get(i).equals(res.get(k))) {
                    break;
                } else if (k == res.size() - 1) {
                    res.add(list.get(i));
                }

            }

            i++;
        }


        return res;

    }


    /**
     * Takes two sorted ArrayLists arr1 and arr2 without duplicates
     * and merges them into one sorted ArrayList.
     * Example: arr1 = 5, 10, 15; arr2 = 1, 7, 9, 10, 19. The result should be:
     * 1, 5, 7, 9, 10, 10, 15, 19
     *
     * @param arr1 sorted ArrayList
     * @param arr2 sorted ArrayList
     * @return sorted ArrayList that contains elements from arr1 and arr2
     */

    // compare index 0 of both arrays
    // add smaller number for index 0 (j0)
    // reindex: update the index so that the next value becomes index 0


    // 1    5   10   15                i = 0
    // 5    7    9    10    15  j = 0
    public static ArrayList<Integer> mergeSortedArrayLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList();
        // FILL IN CODE


        int i = 0;
        int j = 0;

        while (i < arr1.size()) {
            while (j < arr1.size()) {
                if (arr2.get(i) <= arr1.get(j)) {
                    res.add(arr2.get(j));
                    i++;
                } else {
                    res.add(arr1.get(i));
                    i++;
                }

            }
        }



// add arrays together

// add arr1 to res
/*

        for (int i = 0; i < arr1.size(); i++) {
            res.add(arr1.get(i));
        }

        // add arr2 to res
        // res length is length of arr1

        for (int j = 0; j < arr2.size(); j++) {
            res.add(arr2.get(j));
        }

        // now you have a new res arraylist
        // sort res arraylist from lowest to highest with loops and if statements

        int holder;

        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.size(); j++) {

                if (res.get(j) > res.get(i)) {
                    holder = res.get(i);
                    res.set(i, res.get(j));
                    res.set(j, holder);
                }
            }


        }
*/

        return res;
    }

    /**
     * Takes a 2D ArrayList (ArrayList of ArrayLists of integers) and
     * places all of its elements into a one dimensional ArrayList of integer,
     * row by row.
     *
     * @param matrix ArrayList of ArrayLists of Integers
     * @return one dimensional ArrayList of elements
     */
    public static ArrayList<Integer> convertTo1D(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> res = new ArrayList();
        // FILL IN CODE

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                res.add(matrix.get(i).get(j));
            }
        }


        return res;
    }
}

