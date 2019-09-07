public class Sort {
    /**find the smallest item: findSmallest
     move to the front: swap
     selector sort the rest (recursion, maybe?)*/
    public static void sort(String[] x){
        sort(x, 0);

    }

    /***helper method: return the index of smallest string
     * starting at start position
     public simply to make test more easily. but it is ugly*/
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for (int i = start; i < x.length; i +=1){
            if(x[i].compareTo(x[smallestIndex])<0){
                smallestIndex = i;
            }
        }
        System.out.println(smallestIndex);
        return smallestIndex;
    }

    /**swap item*/
    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a]=x[b];
        x[b]= temp;
    }

    /**Sort x starting at position start start:
     * recursive: base case!*/
    public static void sort(String[]x, int start){
        if(start == x.length){
            return ;
        }
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        //System.out.println(Arrays.toString(x));
        sort(x, start + 1);
    }

    public static void main(String[] agrs){
        String[] input = { "mysterious", "diary", "a","records", "the voice"};
        String[] expect = {"a","diary", "mysterious", "records", "the voice"};

        Sort.sort(input);

    }
}
