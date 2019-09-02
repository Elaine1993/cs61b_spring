import java.util.Arrays;

/** Array is a class,
 * a sequence of numbered(means it been labled)memory boxes,
 * but has no method
 * the length is fixed.
 * all the box has the same type of value.
 * create: int[] name = new int[]{bla, bla bla,bla}*/

/***
 * Array  Use []; data type is single one type; length is fixed
 * Class use Dot Notation; data type can have multiple; memory box is fixed too.
 */

/**benefit of Array vs Class:
 * [] notation of array allows us to specify
 * which index we'd like at runtime(after complie, javac)*/

public class AList_Foundamental {
 /*   private AList[] a = new AList[10];

    public String toString(){
        return Arrays.toString(a);
    }
*/
    public static void main(String[] args){
        int[] z = null;
        int[] x, y;

      /** x is the reference(pointer) of array, which stores 1,2,3,4,5.
        if x get reassigned, then the reference get lost
       and Java GARBAGE Collector will clean the array
        */
      x = new int[]{1,2,3,4,5};
//        y also point to the adrres of array as above
        y = x;

//        lost the pointer
        x = new int[]{-1,2,5,4,99};

//        y lost the pointer to array above
        y = new int[3];

        z = new int[0];

        int xL = x.length;

//        new string array
        String[] s = new String[6];
        s[4]= "ketchup";
        s[x[3]-x[1]] = "muffins";

        int[] b = {9,10,11};
        System.arraycopy(b,0,x,3,2);
        System.out.println(Arrays.toString(x));
    }




}
