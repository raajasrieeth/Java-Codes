import java.util.Scanner;
public class switch_cases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age.")
        int age = scan.nextInt();

        switch (age) {//an input is evaluated
            case 12:
                System.out.println("You are 12 years old.");
                break;//if any case is matched , all following cases are  run.
            case 23:
                System.out.println("You are 56 years old");
                break;
            case 10:
                System.out.println("You are 10 years old");
                break;
            default://If none of the cases match.
                System.out.println("You are a human.");
                break;
        }
    }//See the weekDays.java for a direct implementation.

}


