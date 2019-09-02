/** Array based list
 * index:    0 1 2 3 ... n
 * items = [ 0 0 0 0 ... 0] (initial as 0)
 * size: 0
 */


public class AList {
    /**create a int array first, simply call:
     * int[] a; (can be generize later on)
     * Need a size, not because of class, but because:
     * we need it in the later mathod: getsize etc.
     */

    private int [] items;
    private int size;

    /** This is a CONSTRUCTOR
     * Creates an empty list, instantiate a list
     * key word: new int[]
     * for now the size is 0*/
    public AList(){
        items = new int[100];
        size = 0;
    }

    /**re-size the underlying array to the target capacity
     * * special case: when array is running out of space:
     * create a new array(int[]), with size = size +1
     * copy the conten from item to a
     * then let items pointer to the new array a--> now the item, has length = size + 1
     * and the last one is null or empty, so now we can continue to do update and size increase after update the last item */
    public void resize(int capacity){
        int[] a = new int[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }
    /**insert x into the back of the list
     * Invariance(rule): next item we want to add,
     * it actually at position "size"
     * then after we add one, the size will grow by 1
     */
    public void addLast(int x){
        if(size == items.length){
            resize(size * 2);
        }
        items[size] = x;
        size +=1;
    }
    /** return the item item from the back of the list
     *  Invariance(rule): the item we want to return
     *  it actually at position "size-1"
     */
    public int getLast(){
        return items[size-1];
    }
    /**gets the ith item from the lost. (0 is front)
     * Invariance(rule):
     */
    public int get(int i){
        return items[i];

    }

    /**return number of items in list*/
    public int size(){
        return size;

    }
    /**delete item from back of the list and
     * return deleted item*/
    public int removeLast(){
       int x = getLast();
       size = size -1;
       return x;
    }
}
