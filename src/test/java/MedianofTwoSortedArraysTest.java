import org.example.Main;
import org.example.MedianofTwoSortedArrays;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MedianofTwoSortedArraysTest {

    @Test
    public void testOneEvenOneOddArrays(){
        int [] array1 = new int[]{10,20,30,40};
        int [] array2 = new int[]{16, 24,36};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(24.000, result);
    }

    @Test
    public void testTwoEvenArrays(){
        int [] array1 = new int[]{10,20,30,40};
        int [] array2 = new int[]{16, 24,36,45};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(27.000, result);
    }

    @Test
    public void testTwoOddArrays(){
        int [] array1 = new int[]{10,20,30};
        int [] array2 = new int[]{16, 24,25};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(22.000, result);
    }

    @Test
    public void testFirstArrayisGreaterElementsThanOther(){
        int [] array1 = new int[]{10,20,30};
        int [] array2 = new int[]{1,2,3};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(6.5, result);
    }

    @Test
    public void testSecondArrayisGreaterElementsThanOther(){
        int [] array1 = new int[]{1,2,3};
        int [] array2 = new int[]{10,20,30};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(6.5, result);
    }

    @Test
    public void testElementsWithSecondEmptyArray(){
        int [] array1 = new int[]{1,2,3};
        int [] array2 = new int[]{};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(2.0, result);
    }

    @Test
    public void testElementsWithFirstEmptyArray(){
        int [] array1 = new int[]{};
        int [] array2 = new int[]{1,2,3};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(2.0, result);
    }

    @Test
    public void testWithTwoEmptyArrays(){
        int [] array1 = new int[]{};
        int [] array2 = new int[]{};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        double result = medianofTwoSortedArrays.findMedian(array1, array2);
        assertEquals(0.0, result);
    }

}
