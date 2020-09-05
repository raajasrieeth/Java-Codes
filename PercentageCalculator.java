import java.util.Scanner;
public class PercentageCalculator {
    float max_marks;//create attributes
    float obtained;
    float subject_max;
    Scanner scan =  new Scanner(System.in);//to take input

    public float Calculator_exam(){
        //TODO:calculate the percentage if both the max marks of the exam and the obtained total are known.
        System.out.println("Enter the max marks in the exam");
        max_marks = scan.nextInt();
        System.out.println("Enter the marks obtained in the exam");
        obtained = scan.nextFloat();
        return (obtained/max_marks)*100;
    }
    public float Calculator_sub(){
        //TODO:calculate the marks obtained in the subject.
        System.out.println("Enter the max marks in the subject");
        subject_max = scan.nextFloat();
        System.out.println("Enter the marks obtained in the subject");
        obtained = scan.nextFloat();
        return (obtained/subject_max)*100;
    }
    public static void main(String[] args) {
        PercentageCalculator student = new PercentageCalculator();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter e if you want to calculate your exam marks or s if subject marks");
        String choice = scan.next();
        switch (choice.toLowerCase()) {
            case "e":
                System.out.println("You obtained "+ student.Calculator_exam()+"% .");
                break;
            case "s":
                System.out.println("You obtained "+ student.Calculator_sub()+"% .");
                break;
            default:
                System.out.println("Error");
                break;
        }


    }
}
