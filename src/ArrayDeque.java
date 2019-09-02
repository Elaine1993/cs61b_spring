import javax.xml.crypto.Data;

public class ArrayDeque<DataType> {

    private DataType[] items;
    private int size;
    private int nextFirst;
    private int nextLast;

    /**constuctor:
     * create an empty deque */
    public ArrayDeque(){
        items = (DataType[]) new Object[8];
        size = 0;
        nextFirst = 0;
        nextLast = 1;
    }

    public static void main(String[] args){
        System.out.println("Hello World!");


    }

}

