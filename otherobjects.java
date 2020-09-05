public class otherobjects {
    public static void main(String[ ] args) {
        objects ob = new objects();//new object.
        System.out.println(ob.x);//print value of x from the other class, in the same dir.
        more_methods bentley = new more_methods();
        bentley.carMaxSpeed(456);//accessing the data from another class
    }
}