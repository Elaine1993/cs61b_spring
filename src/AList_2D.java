import java.util.Arrays;

/** array of array reference
 * */

public class AList_2D {

    public static void main(String[] args){
        // A array of (integer array) reference
        int[][] elaine;

        //array of array reference.
        elaine = new int[4][];
        //create a new array, and assigned it with the first element of elaine array
        int[] rowZero = elaine[0];

        /**assigned the first element,
         * Let the first elaine array element POINT TO
         * a new int array, which stores value 1.
         */
        elaine[0] = new int[]{1};
        elaine[1] = new int[]{1, 1};
        elaine[2] = new int[]{1,2,3};
        elaine[3] = new int[]{100,45,66};

        int[] rowTwo = elaine[2];
        //change the value 2 to 100, now it is {1,100,3}
        rowTwo[1] = 100;

        int[][] matrix;
        matrix = new int[4][];
        matrix = new int[4][4];

        int[][] elaineTwo = new int[][]{{1},{1,1},{1,2,1},{1}};

        System.out.println(Arrays.toString(elaineTwo[3]));

    }



}
