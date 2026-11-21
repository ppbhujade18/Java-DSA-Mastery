public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eats();
        d1.breath();
        d1.walk();
        d1.barks();
    }
}

class Animal{
    void eats(){
        System.out.println("eats");  //parent 
    }
    void breath(){
        System.out.println("breath");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("walks"); //child class inherits properties from parent class (Single level)
    }
}

class Dog extends Mammals{
    void barks(){
        System.out.println("bark"); //child class inherits properties from another child/ derived class (multi level) 
    }
}
