public class more_methods {
    static void myStaticMethod(){//no need to create an object.
        System.out.println("This is a static method.");
    }
    public void myPublicMethod(){//need to create an object.
        System.out.println("This is a public method.");
    }
    public void carMaxSpeed(int speed){
        System.out.println("This car runs at a max speed of: " +speed);
    }
    static void carName(String name){
        System.out.println("The name of the car is: "+ name);
    }
    public static  void main(String[ ] args) {
        myStaticMethod();
        more_methods obj = new more_methods();
        obj.myPublicMethod();
        //now as a car template:
        more_methods Toyota = new more_methods();
        Toyota.carMaxSpeed(23);
        Toyota.carName("noName");//static can also be accessed with an object , but public cant be accessed  WITHOUT an object.
    }
}
