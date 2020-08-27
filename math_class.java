import java.lang.Math;
public class math_class {
    public static void main(String[ ] args) {
        int num1 = 7 , num2 = 3;
        System.out.println(Math.max(num1,num2));//Math class is built in
        System.out.println(Math.min(num1 , num2));//smaller number ,Math.max returns the larger number.
        System.out.println(Math.sqrt(36));//returns the square root.
        System.out.println(Math.abs(-34));//returns absolute value
        System.out.println(Math.random());//returns number between 0 and 1
        System.out.println(12 + 16-12*(Math.random()));//return number between 12 and 16
        //refer https://www.geeksforgeeks.org/java-lang-math-class-in-java-set-1/
        
    }

}