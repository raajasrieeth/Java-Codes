import java.util.Scanner;
//Receive input and return the corresponding day of the week
public class weekDays {
    public static void main(String[ ] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for the day of the Week:");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("You Entered 1, it is a Sunday.");
                break;
            case 2:
                System.out.println("You Entered 2, it is a Monday.");
                break;
            case 3:
                System.out.println("You Entered 3, it is a Tuesday.");
                break;
            case 4:
                System.out.println("You Entered 4, it is a Wednesday.");
                break;
            case 5:
                System.out.println("You Entered 5, it is a Thursday.");
                break;
            case 6:
                System.out.println("You Entered 6, it is a Friday.");
                break;
            default:
                System.out.println("You Entered 7, it is a Saturday");
                break;
        }
    }
    
}