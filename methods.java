public class methods {
    //TODO:use methods
    //Methods are a block of code that is run when called
    //static is used to specify that it belongs to the main class and not to a main object.
    /*ie , When a member is declared static, it can be accessed before any
    objects of its class are created, and without reference to any object.*/
    static int meth_Sum(int a, int b){//int is used to specify the end value must be of int type.
        //a , b are the parameter.
        /*Note that when you are working with multiple parameters, the method call
        must have the same number of arguments as there are parameters,
        and the arguments must be passed in the same order.
        */
        int result = a+b;
        return result;
    }
    static void MyMethod(){//void, ie, nothing is returned.
        //code
        System.out.println("Hello There!");
    }
    //Method overloading:
    //With method overloading, multiple methods can have the same name with different parameters:
    //Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
    static int Add(int a, int b) {
        return a + b;
    }
    static double Add(double a  , double b){
        return a + b;
    }
    //Now to print out the sum of a range of numbers using a recursive approach:
    /*Every recursive function should have a halting condition, which is the condition where the
    function stops calling itself. */
    static int Summer(int range){
        if(range>0){
            int result = range+Summer(range-1);//again run the summer method on the number 1 less than the range , and the process continues.
            return result;
        }
        else{
            return 0;
        }
    }
    static int SummerV2(int range){//iterative approach
        int result = 0;
        for(int r= range;r>0;r--){
            result += r;
        }
        return result;
    }
    public static void main(String[ ] args) {
        MyMethod();//call the method.
        System.out.println(meth_Sum(5,3));
        System.out.println(Add(3, 5));
        System.out.println(Add(3.1d,4.4d));//can also accept double values.
        System.out.println(Summer(10));
        System.out.println(SummerV2(10));

    }

}