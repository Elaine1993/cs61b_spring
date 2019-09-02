/** A list of integers, which hides the nekedness within
 * don't have next, only has first(let user be more easy
 *
 *
 * private class/private variable
 * instance variable
 * constructor
 * add to First: first = new IntNode(x, first)
 * get first: first.item
 * add to Last: iterate, then p.next = new IntNode(x, null)
 * size: iterate, recursion.
 *
 *
 * */
public class SLList {
    /**nested class*/
    private class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    /**cannot be accessed by other class
     * a signal to other programmer that they shouldn't mess up this*/
    private IntNode first;
    private int size;

    /**constuctor*/
    public  SLList(int x){
        first = new IntNode(x, null);
        size = 1;
    }

    /**add X to the front of the list*/
    public void addFirst(int x){
        first = new IntNode(x, first);
        size = size +1;
    }

    /** return the first item in the list*/
    public int getFirst(){
        return first.item;
    }

    /** add the last item in the list*/
    public void addLast(int x){
        IntNode p = first;
        while (p.next != null){
            p = p.next;

        }
        p.next = new IntNode(x, null);
        size +=1;
    }

    /** get size of--iteration*/
    public int size(){
        IntNode p = first;
        int sum = 1;
        while (p.next != null){
            p = p.next;
            sum += 1;
        }
        return sum;
    }

    /** get size of--recursion
     * need a private static helper function
     * REASON: SLList don't have next, you should need a helper function
     * it only has first*/
    private static int size_recirsion_helper(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size_recirsion_helper(p.next);
    }

    public int size_recursion(){
        return size_recirsion_helper(first);
    }

    /**get size -- by changing the class structure: add one more item*/
    public int size_easiest(){
        return size;

    }
    /** get the last item
     * this is tricky, 'head' comes with IntNode
     * and 'first' is a IntNode
     * if pass in a DList, it will not works.
     * so you need the helper function.*/
    public int getLast_helper (IntNode p){
        if(p.next == null){
            return p.item;
        }
        return getLast_helper(p.next);
    }
    public int getLast(){
        return getLast_helper(first);
    }


    public static void main(String[] args){
        /* create a list of one integer*/
        SLList L = new SLList(10);
        L.addFirst(9);
        L.addFirst(8);
        L.addFirst(7);
        L.addLast(20086);
        System.out.println(L.getFirst());

        System.out.println(L.getLast());
    }

}
