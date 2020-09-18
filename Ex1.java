import java.util.Scanner;
public class Ex1{
    static float score = 0;// class attribute

    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total marks in each subject");
        float total = scan.nextFloat();
        System.out.println("Enter the number of subjects");
        int numOfSubs = scan.nextInt();
        for (int s = 1; s <= numOfSubs; s++) {
            System.out.println("Enter the marks in Subject" + s);
            float $m = scan.nextFloat();
            score = score + $m;
        }
        System.out.println("Your percentile is as follows:");
        System.out.println(score*100/(total*numOfSubs));

    }
}