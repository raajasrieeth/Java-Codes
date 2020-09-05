import java.util.Scanner;
public class Employee{
    //TODO:print details of employees , using constructors
    int age;//create attributes
    int Salary;
    String email;
    String fname;
    String lname;
    int experience;
    String name;
    public Employee(int ag ,int exp, int salary , String fname , String lname){//constructor
        age = ag;
        name = fname +" "+ lname;
        email = fname + "."+lname+ "@blahblah.com";
        Salary = salary;
        experience = exp;

    }
    public String details(){//compile all values into 1 statement
        //exagerration:
        if(age < 100 && age >18){
        return(name+ " is "+ age+ " Years old. He earns  " +Salary+" per month. He has "+ experience+" Years of experience. His email is : "+email);
        }
        else{
            return("Think he's retired or is a fake guy!");
        }
    }
    public static void main(String[ ] args){//main method
        Employee name = new Employee(20 , 1 , 20000,  "Bhola", "S");
        System.out.println(name.details());
        //Uncomment the following to be able to take in input.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the details in the following format:");
        System.out.println("Enter age:");
        int a = scan.nextInt();
        System.out.println("Enter years of experience");
        int e = scan.nextInt();
        System.out.println("Enter salary");
        int s = scan.nextInt();
        System.out.println("Enter first name");
        String fn = scan.next();
        System.out.println("Enter last name");
        String ln = scan.next();
        Employee employee = new Employee(a, e, s , fn , ln);
        System.out.println(employee.details());

    }
}