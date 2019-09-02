
/** test use lecture1 class*/
public class lecture2 {
    //System.out.println(a.size());
    public static void main(String[] arg){
        AListGeneric<String> A = new AListGeneric<>();
        int i = 0;
        long start = System.currentTimeMillis();
        while (i <100000){
            A.addLast("HA");
            i = i + 1;
        }
        System.out.println(A.size());
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time takes:" + timeElapsed);
    }

}
