class maincl{
    int x = 45;
    String name;
    class sb{
        int y = 345;
        String role;
    }
}
public class InnerClass {
    public static void main(String[] args){
        maincl obj1 = new maincl();
        maincl.sb obj2 = obj1.new sb();
        System.out.println(obj1.x + obj2.y);
        /*OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
    These nested classes are useful while dealing with vector mechanics.
    */
    }
}
