public class objects {
    int x = 5;//variable x , also called 'attribute' of the class , can be overrriden
    final int k = 45; //cant be over-riden
    //example:
    final double pi = 3.14159265359d;//double stores larger values than float , which tends to round values off.
    int y = 23;
    int a;//no value yet assigned
    //TODO:create class objects
    public static void main(String[] args) {
    objects object1  =new objects();
    object1.y = 1;//change the value of y
    object1.a = 24;//New value.
    System.out.println(object1.x);//print value of x., inherited from class.
    System.out.println("Pi is: "+object1.pi);
    objects object2 = new objects();
    object2.x = 234;//new value , without affecting other values.
    System.out.println("x for object1 is: " + object1.x);
    System.out.println("X for object2 is: " + object2.x);
    }

}