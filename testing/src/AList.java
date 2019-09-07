/**AList is the hyponnym of ListUtil, inherite the interface from their super-class(hypernym) relationship
 * Alist is a subclass
 * ListUtil is a super class
 * method in AList will OVERRIDES method in ListUtil
 *
 * Override is just a marker. Wil NOT compile if declare a method "Overrider" but in reality it's not*/
public class AList<dataType> implements ListUtil<dataType>{
    private dataType[] items;
    private int size;

    public AList(){
        items = (dataType[]) new Object[100];
        size = 0;
    }

    public void resize(int capacity){
        dataType[] temp = (dataType[]) new Object[capacity];
        System.arraycopy(items, 0, temp, 0, size);
        items = temp;
    }
    @Override
    public void addLast(dataType x){
        if(size == items.length){
            resize(size*2);
        }
        items[size] = x;
        size = size + 1;
    }
    @Override
    public dataType getLast(){
        return items[size-1];

    }
    @Override
    public dataType get(int i){
        return items[i];
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public dataType removeLast(){
        dataType a = items[size-1];
        items[size -1]= null;
        size = size -1;
        return a;
    }
    @Override
    public void insert(dataType x, int position){
        dataType[] newItem = (dataType[]) new Object[items.length+1];
        System.arraycopy(items, 0, newItem, 0, size);;
        newItem[position] = x;
        System.arraycopy(items, position, newItem, position+1, items.length - position);
        items = newItem;
        size = size +1;
    }
    @Override
    public void addFirst(dataType x){
        insert(x, 0);
    }
    @Override
    public dataType getFirst(){
        return get(0);
    }

}
