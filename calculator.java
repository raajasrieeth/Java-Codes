import java.util.Scanner;//for input


public class calculator{
    //TODO:make a calculator.
    public static void main(String[ ] args){
        Scanner scan = new Scanner(System.in);//new Scanner object.
        System.out.println("Enter the operation");
        String op = scan.next();//store the operation
        try {//assuming the operation is one of the following
        System.out.println("Enter one number");
        float $a = scan.nextFloat();//First number
        System.out.println("Enter the other number");
        float $b = scan.nextFloat();//Second number
        switch (op) {//Switch-case block for various operations
            case "+":
            System.out.println(($a + $b) +" is the answer.");
                break;
            case "-":
            System.out.println(($a-$b)+" is the answer.");
                break;
            case "*":
            System.out.println(($a * $b)+" is the answer.");
                break;
            case"/":
            System.out.println(($a/$b)+" is the answer.");
                break;
            default://not any of the operation
            System.out.println("Enter a valid operation.");
                break;
        }

        } catch (Exception e) {//catch the error.ie, there was a String entered instead of a number.
            //TODO: handle exception
            System.out.println("Error!");
        }



    }

}