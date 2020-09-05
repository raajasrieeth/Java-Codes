public class constructors {
    String name;//create class attribute
    int x;
    public constructors(){
        x = 34;//an attribute now accessible by all objects, valued by the constructor method.
        name = "Name";
    }
    public static void main(String[ ] args) {
        /*A constructor in Java is a special method that is used to initialize objects.
        The constructor is called when an object of a class is created.
        It can be used to set initial values for object attributes: */
        constructors obj = new constructors();
        System.out.println(obj.name);
        System.out.println(obj.x);
    }
}
