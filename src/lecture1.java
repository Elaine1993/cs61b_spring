public class lecture1 {

//1. All Java code needed to run inside a class, which is the same name as the file
//2. public static void main(){}
//3. variable(even the return value of method) must be declared first and cannot be change to other type
//4. type are valified before the code run
//5. method in java only return 1 value.

    /** instance variable
     * cannot apply to class, instantiate by instance(object)
     * lecture1.weight IS NOT OKAY*/
    public int weight;

    /**static variable==>
     * apply to class, all object will have
     * lecture1.total_legs is okay*/
    public static int total_legs = 4;

    /** constructor for dogs*/
    public lecture1(int w){
        weight = w;
    }

    /** non-static method. instance method*/
    public  void makeNoise(){
        if (weight <10){
            System.out.println("yip!");
        } else if (weight <30){
            System.out.println("Bark!");
        }else {
            System.out.println("Mark!");
        }
    }
    /** typically define a main method, and with (String[], args) as argument*/
//    public static void main(String[] args){
//        System.out.println(larger(-45,800));
//        makeNoise();
//    }

    public static lecture1 maxDog(lecture1 d1, lecture1 d2){
        if(d1.weight<d2.weight){
            return d2;
        }else{
            return d1;
        }
    }

}
