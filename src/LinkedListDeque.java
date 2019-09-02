import javax.xml.crypto.Data;

public class LinkedListDeque<DataType> {
    /**nested class*/
    private class DataTypeNode {
        public DataType item;
        public DataTypeNode prev;
        public DataTypeNode next;
        public DataTypeNode(DataType i, DataTypeNode m, DataTypeNode n){
            item = i;
            prev = m;
            next = n;
        }
    }

    /**cannot be accessed by other class
     * the first item in deque is sentinel.next */
    private DataTypeNode sentinel;
    private int size;

    /**constuctor:
     * create an empty deque */
    public LinkedListDeque(){
        sentinel = new DataTypeNode(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    /**Adds an item of type T to the front of the deque:
     * 2 things change:
     * 1) create a new IntNode for item, let sentinel.next point to it.
     * 2) the old first deque, .next remain the same. but .prev point to the new item*/
    public void addFirst(DataType item){
        sentinel.next = new DataTypeNode(item, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size = size +1;
    }
    /**Adds an item of type T to the back of the deque.
     * 1) create a IntNode for item. Sentinel.prev point to the new_last node
     * 2) the old last deque, .pre remain the same, but .next point to this new item */
    public void addLast(DataType item){
        sentinel.prev = new DataTypeNode(item, sentinel.prev, sentinel);
        sentinel.prev.prev.next = sentinel.prev;
        size = size +1;
    }
    /**Returns true if deque is empty, false otherwise.*/
    public boolean isEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }
    /**Returns the number of items in the deque.*/
    public int size(){
        return size;
    }
    /**Prints the items in the deque from first to last,
     separated by a space. Once all the items have been printed,
     print out a new line.*/
    public void printDeque(){
        int i = 0;
        DataTypeNode p = sentinel.next;
        while (i < size){
            System.out.println(p.item + ",");
            p = p.next;
            i +=1;
        }
        System.out.println();
    }

    /**Removes and returns the item at the front of the deque.
     If no such item exists, returns null.*/
    public DataType removeFirst(){
        if(isEmpty()){
            return null;
        }
        DataType x = sentinel.next.item;
        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
        size = size -1;
        return x;
    }
    /**Removes and returns the item at the back of the deque.
     * If no such item exists, returns null.*/
    public DataType removeLast(){
        if(isEmpty()){
            return null;
        }
        DataType x = sentinel.prev.item;
        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
        size = size - 1;
        return x;

    }
    /**Gets the item at the given index, where 0 is the front,
     * 1 is the next item, and so forth.
     * If no such item exists, returns null.
     * Must not alter the deque!
     */
    public DataType get(int index){
        DataTypeNode p = sentinel.next;
        for(int i = 0; i <index; i++){
            p = p.next;
        }
        return p.item;
    }

    /**Creates a deep copy of other*/
    public LinkedListDeque(LinkedListDeque other){
        sentinel = new DataTypeNode(null, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;

        for (int i = 0; i < other.size(); i++){
            addLast((DataType) other.get(i)); //(T) is cast, since type of other is unknown
        }

    }

    /** Same as get, but uses recursion.
     * need a helper method*/
    private DataType getRecursive(int index, DataTypeNode p){
        if(index == 0){
            return p.item;
        }
        return getRecursive(index -1, p.next);
    }

    public DataType getRecursive(int index){
        return getRecursive(index, sentinel.next);
    }


    public static void main(String[] args){
        System.out.println("Hello World!");
        LinkedListDeque l = new LinkedListDeque();
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst("haha");
        l.addFirst(8);
        System.out.println("First Print");
        l.printDeque();

        l.addLast(100);
        System.out.println("Second Print");
        l.printDeque();

        l.removeFirst();
        System.out.println("Third Print");
        l.printDeque();

        l.removeLast();
        System.out.println("4th Print");
        l.printDeque();

        System.out.println("the 2th item is: "+ l.get(2));
        System.out.println("the 3th is: "+ l.getRecursive(3));


    }

}

