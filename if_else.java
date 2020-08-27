import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        //TODO:Use if and else conditionals
        Scanner scan = new Scanner(System.in);//create a scan object of class Scanner
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if(age<4){
            System.out.println("You are a kid!");
        }
        else if(age<=5){
            System.out.println("You are still a kid!");

        }
      else{
        System.out.println("You are not a kid");
    }
}
}