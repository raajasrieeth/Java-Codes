import java.awt.*;


//TODO: Show  the different types of variables
class Vars{
    //Syntax : <Data Type> <variable name> = <variable value>;
    // Rules:1--> Digits , underscores , letter, dollar signs are allowed
    // 2 --> Should begin with letter or $ or _
    // 3 --> Case sensitive, white spaces arent allowed , no keywords
    public static void main(String[ ] args){
        String name = "Raaj";
        String hello = "Hello there";//Strings , enclosed in double inv commas
        int age = 14 , age$ = 15 , _age23 = 23;//integer only
        System.out.println(age$+ "\n");
        boolean isBoy = true;// either true or false
        System.out.println(isBoy+ "\n");
        char key = 'g';//stand for a single letter , use single inverted commas
        System.out.print("Key Example: " + key+ "\n");
        float num = 0.3f;//the f is needed
        double d = 2.33;//better than a float
        System.out.println(hello + " " + name + " you are " + age + " years old."); //uses String type and int
    }
}

