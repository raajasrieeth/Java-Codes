public class Loop{
    public static void main(String[ ] args){
        
        //TODO: Make a loop returning updated values
        //TODO: Show the difference between the updated values in the loop and out of the loop
        
        int x = 1;
        System.out.println("Before the loop x is:" + x );
        while (x < 5){
            System.out.println("In the Loop");
            System.out.println("x is" +" "+ x);
            x = x + 1;
        }
        System.out.println("After the loop x is: " + x);
    }


}
