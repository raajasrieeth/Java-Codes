public class methods {
    //TODO:use methods
    //Methods are a block of code that is run when called
    //static is used to specify that it belongs to the main class and not to a main object.
    static int meth_Sum(int a, int b){//int is used to specify the end value must be of int type.
        int result = a+b;
        return result;
    }
    public static void main(String[ ] args) {
        System.out.println(meth_Sum(5,3));

    }

}