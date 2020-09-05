public class Modifiers {
    //https://www.w3schools.com/java/java_modifiers.asp
    //TODO :Use various types of modifiers.
    /*Access Modifiers - controls the access level
    Non-Access Modifiers - do not control access level, but provides other functionality 

    For classes, you can use either public or default:

Modifier |	Description
public	 |   The class is accessible by any other class
default  |	The class is only accessible by classes in the same package.
    This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
    ++++
Modifier  |	Description
public	  | The code is accessible for all classes
private	  | The code is only accessible within the declared class
default	  | The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
protected | The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter*/
    public String func(){//can be accessed by all classes
        return "Hello";
    }
    private int power(int hp){//usable only on the declared class
        int num = hp;
        return num;
    }
    default void name(){//accessible in the same PACKAGE.
        System.out.println("hello there!");
    }
    protected float calc(float num1 , float num2){
        return num1+num2;
    }
    public static void main(String[ ] args){
        System.out.println();
    }
}
