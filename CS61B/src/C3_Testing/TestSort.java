package C3_Testing;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;


public class TestSort {

    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        String[] input2 = {"an", "egg", "have", "i"};

        Sort.sort(input);

        //        if (input != expected){ // abuse of !=
        //            System.out.println("Error Sort");
        //        }
        if(!Arrays.equals(input,  expected)){
            System.out.println("Sort Error!");
        }
//        org.junit.Assert.assertArrayEquals(input, expected);
        assertArrayEquals(input, expected);

    }

    // Test the Sort.findSmallest Method
    public static void testFindSmallest(){
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";

        String actual = Sort.findSmallest(input);
        assertEquals(expected, actual);

    }

    public static void main(String[] args) {
        testFindSmallest();
    }
}
