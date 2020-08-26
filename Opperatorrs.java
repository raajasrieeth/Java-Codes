public class Opperatorrs{
    //TODO: Show the types of operators.
    /*
    Operand , Operator , Operand = Result
    4           +           3    =   11
    Types of operators:
    1) Arithmetic
    2) Assignment
    3) Logical
    4) Comparison
    */
    public static void main(final String[] args) {
        // Arithmetic opps:
        int num1 = 6, num2 =3;
        System.out.println("The result of num1 + num2:");//Println creates a new line , the method is different for various types
        System.out.println(num1 + num2);

        System.out.println("The result of num1 x num2:");//multiplication
        System.out.println(num1 * num2);

        System.out.println("The result of num1 - num2:");//difference
        System.out.println(num1 - num2);

        System.out.println("The result of num1 / num2:");//division
        System.out.println(num1 / num2);

        System.out.println("The result of num1 % num2:");//remainder
        System.out.println(num1 % num2);

        //Increment/Decrement operators
        System.out.println(num1++);//takes , num1(already printed) and then returns num1
        System.out.println(++num1);//returns incremented value
        System.out.println(num1--);//the current value of num1 is printed , then is decremented
        System.out.println(--num1);//First decremented , then printed.

        //Assignment opps:
        int num3 = 34;//Equal to is an assignment opp
        System.out.println(num3);
        num3 += 2;//num2 is increased by 2
        System.out.println(num3);
        num3 %= 2;// returns the remainder , assigns it to num1
        System.out.println(num3);
        num3 *= 5;//return the product , assigns it to num1
        System.out.println(num3);
        num3 /= 1;//return and assign the quotient
        System.out.println(num3);

        //comparison opps:
        /*
        1. == checks for equality
        2. != checks for inequality
        3. >=
        4. <=
        5. <
        6. <
           */
        System.out.println(num3 == num2);//checks for equality
        System.out.println(num3 >= num1);

        //Logical opps
        /*
        1. && - Logical and , returns true if both conditions are true
        2. || - Logical or , returns true if any condition is true
        3. ! - Logical not,  returns the opposite.
         */
}
}

