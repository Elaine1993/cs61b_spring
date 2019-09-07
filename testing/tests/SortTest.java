import org.junit.Test; 

public class SortTest {
    /**test the Sort.sort method */
    @Test
    public void testSort() {
        String[] input = {"the", "mysterious", "diary", "records", "the voice"};
        String[] expect = {"diary", "mysterious", "records", "the", "the voice"};

        Sort.sort(input);
        //System.out.println(input);
        /** below tedious code can be replaced by org.junit.Assert.assertEquals(expected, input)*/
/*        for(int i = 0; i <input.length; i += 1){
            if(!input[i].equals(expect[i])){
                System.out.println("Mismatch in position" + i +",expected: "+ expect[i] +", but got: " + input[i]);
                return;
            }
        }*/


        org.junit.Assert.assertArrayEquals(expect, input);
    }


    /**test the findSmallest method*/
    @Test
    public void testFindSmallest(){
        String[] input = {"bb", "av", "A", "a", "the voice"};
        int expect = 3;

        int actual = Sort.findSmallest(input, 3);
        //System.out.println(actual);
        /** below tedious code can be replaced by org.junit.Assert.assertEquals(expected, input)*/
        org.junit.Assert.assertEquals(expect, actual);
    }

    /**test the findSmallest method*/
    @Test
    public void testSwap(){
        String[] input = {"d", "av", "A", "a", "the voice"};
        int a = 1;
        int b = 3;
        String[] expect = {"d", "a","A", "av", "the voice"};

        Sort.swap(input, a, b);
        //System.out.println(input);
        /** below tedious code can be replaced by org.junit.Assert.assertEquals(expected, input)*/
        org.junit.Assert.assertArrayEquals(expect, input);
    }



}