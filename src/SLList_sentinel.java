/** A linked list of integers, which hides the nekedness within
 * don't have next, only has first(let user be easier)
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
public class SLList_sentinel {
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
    private IntNode sentinel;
    private int size;

    /**constuctor*/
    public SLList_sentinel(){
        sentinel = new IntNode(1, null);
        size = 0;
    }
    public SLList_sentinel(int x){
        sentinel = new IntNode(1, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /**add X to the front of the list*/
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size = size +1;
    }

    /** return the first item in the list*/
    public int getFirst(){
        return sentinel.next.item;
    }

    /** add the last item in the list*/
    public void addLast(int x){
        IntNode p = sentinel;
        while (p.next != null){
            p = p.next;

        }
        p.next = new IntNode(x, null);
        size +=1;
    }

    /** get size of--iteration*/
    public int size(){
        IntNode p = sentinel;
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
        return size_recirsion_helper(sentinel);
    }

    /**get size -- by changing the class structure: add one more item*/
    public int size_easiest(){
        return size;

    }

    public static void main(String[] args){
        /* create a list of one integer*/
        SLList_sentinel L = new SLList_sentinel(10);
        L.addFirst(9);
        L.addFirst(8);
        L.addFirst(7);
        L.addLast(20086);
        System.out.println(L.getFirst());

        System.out.println(L.size_easiest());
    }

}
