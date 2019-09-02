/** parametrize the class by <>*/

public class SLListGeneric<TypeHolder> {
    private class BasicNode {

        public TypeHolder item;
        public BasicNode next;
        public BasicNode(TypeHolder x, BasicNode y){
            item = x;
            next = y;
        }
    }

    /** instance variable*/
    private BasicNode first;
    private int size;
    /** constructor */
    public SLListGeneric(TypeHolder x){
        first = new BasicNode(x, null);
        size = 1;
    }

    /** get the first item*/
    public TypeHolder getFirst(){
        return first.item;
    }

    /**get the second item */
    public TypeHolder getSecond(){
        return first.next.item;
    }
    /** add x to the head */
    public void addFirst(TypeHolder x){
        first = new BasicNode(x, first);
        size = size + 1;
    }

    /** add x to last */
    public void addLast(TypeHolder x){
        BasicNode p = first;
        while (p.next != null){
            p = p.next;
        }
        p.next = new BasicNode(x, null);
        size = size +1;
    }

    /** get the size of the linked list*/
    public int getSize (){
        return size;
    }

    /** get the last item
     * this is tricky, 'head' comes with IntNode
     * and 'first' is a IntNode
     * if pass in a DList, it will not works.
     * so you need the helper function.*/
    public TypeHolder getLast_helper (BasicNode p){
        if(p.next == null){
            return p.item;
        }
        return getLast_helper(p.next);
    }
    public TypeHolder getLast(){
        return getLast_helper(first);
    }


    public static void main (String[] args){
        SLListGeneric dl = new SLListGeneric(10);
        dl.addFirst(2);
        dl.addFirst(45);
        dl.addLast("hahaha");
        System.out.println("the first item is:" + dl.getFirst());
        System.out.println("the size is: "+ dl.getSize());
        System.out.println("the second element is: "+ dl.getSecond());
        System.out.println("the last element is: "+ dl.getLast());

    }



}
