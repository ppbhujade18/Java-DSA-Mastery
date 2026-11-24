public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Horse : ");
        h.eat();
        h.walk();
        System.out.println( "default animal color: "+ h.color);
        h.colorChange();
        System.out.println("After changing color : " + h.color);

        Chicken c = new Chicken();
        System.out.println("Chicken : ");
        c.eat();
        c.walk();
        System.out.println("default animal color: " + c.color);
        c.colorChange();
        System.out.println("After changing color : " + c.color);

        //Animal a = new Animal(); //1. cannot create an instance/object of  Abstract class

    }
}

// 1.cannot create instance of abstarct class
// 2. Abstract class have abstract and non abstract methods
// 3. can have constructors


abstract class Animal{
    String color;
    Animal(){
        color = "brown"; //// 3. can have constructors
    }
    void eat(){
        System.out.println("Animal Eats"); //non abstract methods
    }
    
    abstract void walk();  // 2. Abstract class have abstract and non abstract methods
}
class Horse extends Animal{
    void colorChange(){
        color ="dark brown";

    }
    void walk(){
        System.out.println("Horse Walk on four legs");
    }
}
class Chicken extends Animal{
    void colorChange(){
        color ="Yellow";
    }
    void walk(){
        System.out.println("Chicken Walk on two legs");
    }
}