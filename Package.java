package mypackage;
class Package{
    int x = 0; //attribute
    static int number(int num){
        return num;
    }
    static void something(){
        System.out.println("Yeah Boy");
    }
    public static void main(String[ ] args) {
        System.out.println("Hello There!");
        System.out.println(number(43));
        something();
    }
}