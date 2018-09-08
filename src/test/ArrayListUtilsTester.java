package test;

import main.ArrayListUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


/** Contains JUnit tests for testing ArrayListUtils methods */
public class ArrayListUtilsTester {

    /** Test computeMean method */
    @Test
    public void testComputeMeanSimple() {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(8, 1, 3));
        double studentRes = ArrayListUtils.computeMean(arr);
        double expectedRes = 4.0;
        boolean res = (Math.abs(studentRes - expectedRes) < 0.0001);
        assertTrue("In testComputeMeanSimple the result is not as expected", res);
    }

    /** Test computeMean method, longer ArrayList */
    @Test
    public void testComputeMeanMedium() {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(8, 1, 3, 9, 10, 0, 2));
        double studentRes = ArrayListUtils.computeMean(arr);
        //System.out.println(studentRes);
        double expectedRes = 4.714;
        boolean res = (Math.abs(studentRes - expectedRes) < 0.001);
        assertTrue("In testComputeMeanMedium the result is not as expected", res);
    }

    /** Test computeMean method, empty ArrayList */
    @Test
    public void testComputeMeanEmptyList() {
        ArrayList<Integer> arr = new ArrayList();
        double studentRes = ArrayListUtils.computeMean(arr);
        double expectedRes = 0.0;
        boolean res = (Math.abs(studentRes - expectedRes) < 0.0001);
        assertTrue("In testComputeMeanEmptyList the result is not as expected", res);
    }

    /** Test lastIndexOfElem method */
    @Test
    public void testLastIndexOfElem() {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(9, 3, 2, 3, 1, 9, 9, 8, 1));
        int studentRes = ArrayListUtils.lastIndexOfElem(arr, 9);
        assertTrue("In testLastIndexOfElem, the result is incorrect", studentRes == 6);

    }

    /** Test reverse method */
    @Test
    public void testReverse() {
        ArrayList<Integer> studentRes = new ArrayList(Arrays.asList(9, 3, 2, 10, 1));
        ArrayListUtils.reverse(studentRes);
        ArrayList<Integer> expectedList = new ArrayList(Arrays.asList(1, 10, 2, 3, 9));
        assertTrue(studentRes != null);
        assertTrue(studentRes.size() == expectedList.size());
        for (int i = 0; i < studentRes.size(); i++) {
            assertTrue("In testReverse, the result is not what is expected.", studentRes.get(i) == expectedList.get(i));
        }
    }

    /** Tests removeDuplicates method */
    @Test
    public void testRemoveDuplicates() {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(9, 3, 2, 3, 1, 9, 9, 8, 1));
        ArrayList<Integer> studentRes  = ArrayListUtils.removeDuplicates(arr);
        ArrayList<Integer> expectedList = new ArrayList(Arrays.asList(9, 3, 2, 1, 8));
        assertTrue(studentRes != null);
        assertTrue("In testRemoveDuplicates: size is not as expected", studentRes.size() == expectedList.size());
        for (int i = 0; i < studentRes.size(); i++) {
            assertTrue("In testRemoveDuplicates, the result is not what is expected.", studentRes.get(i) == expectedList.get(i));
        }
    }

    /** Tests mergeSortedArrayLists, simple case */
    @Test
    public void testMergeSortedArrayLists() {
        ArrayList<Integer> arr1 = new ArrayList(Arrays.asList(1, 4, 6, 8));
        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(3, 5, 7, 10));
        ArrayList<Integer> studentRes = ArrayListUtils.mergeSortedArrayLists(arr1, arr2);
        //System.out.println(studentRes);
        ArrayList<Integer> expectedList = new ArrayList(Arrays.asList(1, 3, 4, 5, 6, 7, 8, 10));
        // compare student result with expected result
        assertTrue(studentRes != null);
        assertTrue("testMergeSortedArrayLists: size is not as expected", studentRes.size() == expectedList.size());
        for (int i = 0; i < studentRes.size(); i++) {
            assertTrue("In testMergeSortedArrayLists, the result is not what is expected.", studentRes.get(i) == expectedList.get(i));
        }
    }

    /** Tests mergeSortedArrayLists, harder case */
    @Test
    public void testMergeSortedArrayLists2() {
        ArrayList<Integer> arr1 = new ArrayList(Arrays.asList(2, 4, 6));
        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(1, 4, 20, 30, 50));
        ArrayList<Integer> studentRes = ArrayListUtils.mergeSortedArrayLists(arr1, arr2);
        //System.out.println(studentRes);
        ArrayList<Integer> expectedList = new ArrayList(Arrays.asList(1, 2, 4, 4, 6, 20, 30, 50));
        // compare student result with expected result
        assertTrue(studentRes != null);
        assertTrue("testMergeSortedArrayLists2: size is not as expected", studentRes.size() == expectedList.size());
        for (int i = 0; i < studentRes.size(); i++) {
            assertTrue("In testMergeSortedArrayLists2, the result is not what is expected.", studentRes.get(i) == expectedList.get(i));
        }
    }

    /** Tests mergeSortedArrayLists, first list is empty */
    @Test
    public void testMergeSortedArrayListsOneEmptyList() {
        ArrayList<Integer> arr1 = new ArrayList(Arrays.asList());
        ArrayList<Integer> arr2 = new ArrayList(Arrays.asList(10, 20, 30, 50));
        ArrayList<Integer> studentRes = ArrayListUtils.mergeSortedArrayLists(arr1, arr2);
        //System.out.println(studentRes);
        ArrayList<Integer> expectedList = new ArrayList(Arrays.asList(10, 20, 30,50));
        // compare student result with expected result
        assertTrue(studentRes != null);
        assertTrue("testMergeSortedArrayListsOneEmptyList: size is not as expected", studentRes.size() == expectedList.size());
        for (int i = 0; i < studentRes.size(); i++) {
            assertTrue("In testMergeSortedArrayListsOneEmptyList, the result is not what is expected.", studentRes.get(i) == expectedList.get(i));
        }
    }

    /** Test convertTo1D */
    @Test
    public void testConvertTo1D() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList();
        ArrayList<Integer> row0 = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
        matrix.add(row0);
        ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
        matrix.add(row1);
        ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(10, 11, 100));
        matrix.add(row2);
        ArrayList<Integer> studentRes = ArrayListUtils.convertTo1D(matrix);
        //System.out.println(studentRes);
        ArrayList<Integer> expectedList = new ArrayList(Arrays.asList(1, 3, 4, 4, 5, 6, 10, 11, 100));
        // compare student result with expected result
        assertTrue(studentRes != null);
        assertTrue("testConvertTo1D: size is not as expected", studentRes.size() == expectedList.size());
        for (int i = 0; i < studentRes.size(); i++) {
            assertTrue("In testConvertTo1D, the result is not what is expected.", studentRes.get(i) == expectedList.get(i));
        }
        }

}
