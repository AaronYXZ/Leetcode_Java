package C3_Testing;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class TestSort {

    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        String[] input2 = {"an", "egg", "have", "i"};

        Sort.sort(input);

        //        if (input != expected){ // abuse of !=
        //            System.out.println("Error Sort");
        //        }
        //        if(!Arrays.equals(input,  expected)){
        //            System.out.println("Sort Error!");
        //        }
        //        org.junit.Assert.assertArrayEquals(input, expected);
        assertArrayEquals(input, expected);

    }

    // Test the Sort.findSmallest Method
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 1);
        assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 3;

        int actual2 = Sort.findSmallest(input2, 3);
        assertEquals(expected2, actual2);

    }

    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        Sort.swap(input, 1, 3);
        String[] expected = {"i", "egg", "an", "have"};
        assertArrayEquals(input, expected);

    }

    //    public static void main(String[] args) {
    ////        testFindSmallest();
    ////        testSwap();
    //        testSort();
    //    }
}
