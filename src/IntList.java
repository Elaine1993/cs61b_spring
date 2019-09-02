public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;

    }

    /**Return the size of list using recursion*/
    public int size(){
        if (rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**Return the size of list using iteration*/
    public int iterativeSize(){
        IntList p = this;
        int total = 0;
        while (p!=null){
            total +=1;
            p = p.rest;
        }
        return total;
    }


    /**Return the i-th element of list using recursion*/
    public int get(int i){
        IntList L = this;
        if (i ==0){
            return first;
        }
        return rest.get(i-1);
    }

    /**Return the i-th element of list using iteration*/
    public int get_iteration(int i){
        IntList L = this;
        int element_i = 0;
        int total = 0;
        while (total < i){
            L = L.rest;
            element_i = L.first;
            total +=1;
        }
        return element_i;
    }

    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(15, L);
        L = new IntList(255, L);

        System.out.println(L.iterativeSize());
        System.out.println(L.get_iteration(3));

    }
}
