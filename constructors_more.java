public class constructors_more {
    //TODO: use constructor methods , with input parameters
    int a;//create class attribute
    public constructors_more(int b){//constructor to be of same name as that of the class.
        a = b;//set the attribute variable a to the value passed to the constructor.
    }
    public static void main(String[ ] args){
        constructors_more obj = new constructors_more(435);//pass an integer argument.
        System.out.println(obj.a);//
    }
}
