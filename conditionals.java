import java.util.Scanner;

public class conditionals {
    public static void main(String[ ] args){
        //TODO: Use contitionals,  take user input
        Scanner scan = new Scanner(System.in);//'scan' object of type Scanner , Scanner is a class for taking input
        //System.in so that the current system is used for an input.
        System.out.println("Enter something.");
        String input = scan.nextLine();//whole line is taken
        System.out.println("You entered:");
        System.out.println(input);
        System.out.println("Enter Age");
        int age = scan.nextInt();
        System.out.println("Enter your name.");
        String fname = scan.next();//only content before first whitespace is registered
        System.out.println("You are" + " " + fname+ ", " + age+ " years old.");
        //System.out.println("You are" + " " + fname.toUpperCase()/toLowerCase+ " " + age+ " years old.");//Name is in uppercase
        System.out.println("Your name is " + fname.length() + " letters long.");
        // with escape sequences:
        System.out.println("You are" + " \"" + fname+ "\" , " + age+ " years old.");
        /* \\ - backslash , \t - tab , \n - new line*/
        System.out.println(fname.contains("e"));//checks if e in name
        System.out.println(fname.charAt(3));//checks for letter at index 3 , indexes start from 0
        System.put.println(fname.endWith("k"));//checks if fname ends with k
        System.out.println(fname.indexOf("a"));//returns position of first instance of  a string
    }
}