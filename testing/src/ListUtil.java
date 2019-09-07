/**ListUtil is the hypernym of AList
 * interface inheritance: Need to have EXACT SAME signature: Method name, AND parameter datatype,(Name can be different)!!
 * If it is ALL the same, it will be OVERRIDE, Otherwise, if it is only has same name, but different variable, it will be OVERLOAD.
 * implement inheritance(Print()): define the method in super-class
 *However, if in your sub-class you have a method, same name, override the Implement inheritance method,
 * the code will run the Sub-class, instead of the super-class. this is why it called OVERRIDE :)
 * Interface -- */

public interface ListUtil<Item> {
    public void addLast(Item x);
    public void addFirst(Item B);
    public Item getLast();
    public Item getFirst();
    public Item get(int i);
    public int size();
    public Item removeLast();
    public void insert(Item x, int position);

    default public void Print(){
        for (int i =0; i <size(); i+=1){
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }


    /** can parse in parameter: ListUtil instead of AList*/
    public static String longest(ListUtil<String> list) {
        int maxDex = 0;
        for (int i = 0; i < list.size(); i += 1) {
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if (thisString.length() > longestString.length()) {
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }

    /** since Alist is inherite , so Alist can be parse in the longest function*/
    public static void main(String[] args){
        AList<String> somelist = new AList<>();
        somelist.addLast("first");
        somelist.addLast("second");
        somelist.addLast("345");
        somelist.insert("lasssssssssssst", 3);
        System.out.println(longest(somelist));
        somelist.Print();
    }
}
