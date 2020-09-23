//TODO:Use Polymorphism
class Employee{
    protected String name;
    protected String role;
    protected int salary;
    protected double increment;
    Employee( String Name,   int Salary ){//Constructor
        name = Name;
        salary = Salary;
}
    protected String details(){
        return("An employee , earns $ " + salary + "and name is:" + name);
    }
}
class Coder extends Employee{
    Coder(String Name, double  Increment,  int Salary){
        super(Name, Salary);
        name = Name;
        increment = Increment;
        salary = Salary;
}
    @Override
    protected String details() {
        // TODO Auto-generated method stub
        // return super.details(); , returns the same thing in superclass
        return("A Coder. Name is: " + name + ". Earns $ "+ salary + ". Gets an increment of : " + increment+ " %.");
    }
}
class Technician extends Employee{
    Technician(String Name, double Increment , int Salary){
        super(Name, Salary);
        name = Name;
        increment = Increment;
        salary = Salary;
    }
    @Override
    protected String details(){
        return("A Technician. Name is: " + name + ". Earns $ "+ salary + ". Gets an increment of : " + increment+ " %.");
    }
}

public class Company {
    public static void main(String[ ] args) {
        Employee _name = new Employee("Faug" , 30000);
        System.out.println(_name.details());
        Coder name = new Coder("Altman" , 1 , 100000);
        System.out.println(name.details());
        Technician $name = new Technician("Timmy"  , 0.5 , 20000);
        System.out.println($name.details());
    }
}




