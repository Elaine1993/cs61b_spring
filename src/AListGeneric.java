public class AListGeneric<dataType> {

    private dataType [] items;
    private int size;

    /**since 'dataType' cannot be instantial directly
     * we use object to help
     * then use Cast to cast the object to 'dataType'*/
    public AListGeneric(){
        items = (dataType[]) new Object[100];
        size = 0;
    }


    /**re-size the underlying array to the target capacity
     * * special case: when array is running out of space:
     * create a new array(int[]), with size = size +1
     * copy the conten from item to a
     * then let items pointer to the new array a--> now the item, has length = size + 1
     * and the last one is null or empty, so now we can continue to do update and size increase after update the last item */
    public void resize(int capacity){
        dataType[] a = (dataType[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }
    /**insert x into the back of the list
     * Invariance(rule): next item we want to add,
     * it actually at position "size"
     * then after we add one, the size will grow by 1
     */
    public void addLast(dataType x){
        if(size == items.length){
            resize(size*2); // much faster than +n
        }
        items[size] = x;
        size = size +1;
    }
    /** return the item item from the back of the list
     *  Invariance(rule): the item we want to return
     *  it actually at position "size-1"
     */
    public dataType getLast(){
        return items[size -1];

    }
    /**gets the ith item from the lost. (0 is front)
     * Invariance(rule):
     */
    public dataType get(int i){
        return items[i];
    }

    /**return number of items in list*/
    public int size(){
        return size;
    }

    /**delete item from back of the list and
     * return deleted item
     * Note: the pointer to the last item need to be deleted.
     * otherwise the Java garbage collector will not destroy it*/
    public dataType removeLast(){
        dataType x = items[size-1];
        items[size-1] = null; //prevent loitering of the last item
        size = size -1;
        return x;
    }
}
