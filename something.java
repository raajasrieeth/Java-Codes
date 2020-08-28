import java.util.Scanner;

public class something {
    public static void main(String[] args) {
        System.out.println("Enter a range till where you want odd and even numbers.");
        Scanner scan = new Scanner(System.in);//create scanner object
        int rangeUp = scan.nextInt();
        for(int i=0;i<= rangeUp; i++){
            if(i%2 == 0){//condition
                System.out.println("Even: " + i);//even numbers

            }
            else{
                System.out.println("Odd: "+ i);//odd numerals
            }
        }

    }

}