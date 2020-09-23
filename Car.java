//Using inheritance
class Vehicle {
    int maxSpeed;//class attributes
    int numOfWheels;
    protected String name;// The code is accessible in the same package and subclasses. private makes it inaccessible.
    String type;
    Vehicle(String Name , String Type , int numWheels , int speed){//constructor
        maxSpeed = speed;
        numOfWheels = numWheels;
        name = Name;
        type = Type;
    }
    public void honk(){
        System.out.println("Vadim Blyat!");
    }
    protected void details(){
        System.out.println("The name of the car is: " + name + ". It is a "+ type +
        ". It runs at a max speed of: "+ maxSpeed +" kmph. It has "+numOfWheels+" wheels.");
    }
}
class Car extends Vehicle{
    Car(String name, String type, int numOfWheels, int speed){
        super(name, type, numOfWheels, speed);//super is used to derive constructor of superclass.
      }
      public static void main(String[ ] args){//main method to be declared in the main class.
        Car car = new Car("Honda" ,"Car" , 4 , 200 );
        car.honk();
        car.details();
      }
}

