public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        //Animal a = new Animal(); //Cannot instantiate the type Animal  //cannot create an instance/object of  Abstract class

    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal Eats");
    }
    
    abstract void walk();  //can have abstract /non-abstract methods
}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse Walk on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken Walk on two legs");
    }
}