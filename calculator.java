import java.util.Scanner;
import java.lang.Math;

public class calculator{
    //TODO:make a calculator.
    public static void main(String[ ] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the operation");
        String op = scan.next();
        try {
        System.out.println("Enter one number");
        float $a = scan.nextFloat();
        System.out.println("Enter the other number");
        float $b = scan.nextFloat();
        switch (op) {
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
            default:
            System.out.println("Enter a valid operation.");
                break;
        }

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error!");
        }



    }

}