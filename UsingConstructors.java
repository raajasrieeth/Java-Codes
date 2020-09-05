public class UsingConstructors {
    int carSpeed;
    String carName;//Create class attribute
    int carCost;
    public UsingConstructors(int speed, int cost, String name){
        carSpeed = speed;
        carCost = cost;
        carName = name;

    }
    public String info(){
        return("The car travels at a max speed of: " + carSpeed +"km/hr ,  It is priced at $ "+ carCost+ " .Its name is: "+ carName);
    }
    public static void main(String[ ] args) {
        UsingConstructors toyota = new UsingConstructors(400,  2304, "Toyota nut");
        System.out.println(toyota.info());
    }
}

