class Animal{
    public String sound = "A sound.";
    protected void sound() {
        System.out.println(sound);
    }
}
class Dog extends Animal{
    protected void sound() {
        System.out.println("bow wow");
    }
}
class Cow extends Animal{
    protected void sound(){
        System.out.println("moo moo");
    }
}
public class Polymorphism{
    public static void main(String[ ] args){
    Animal pig = new Animal();
    pig.sound();
    Dog dog = new Dog();
    dog.sound();
    Cow cow = new Cow();
    cow.sound();
    }

}