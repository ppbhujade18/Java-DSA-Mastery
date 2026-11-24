public class Abstract {
    public static void main(String[] args) {
        Labrodour mydog = new Labrodour();
    }
}
// Constructor calling hierarchy 1. Animal -> 2. Dog -> 3.Labrodour 
class Animal{
    Animal(){
        System.out.println("Animal Constructor called ");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog Constructor called");
    }
}
class Labrodour extends Dog{
    Labrodour(){
        System.out.println("Labrodour Constructor called");
    }
}
