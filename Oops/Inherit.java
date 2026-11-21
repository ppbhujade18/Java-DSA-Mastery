public class Inherit{
    public static void main(String[] args) {

        
        Bird b1 = new Bird(); // inherits properties from parent class animal
        System.out.println("birds can : ");
        b1.breath();
        b1.fly();

        Fish f1 =new Fish(); // inherits properties from parent class animal
        System.out.println("Fishes can : ");
        f1.breath();
        f1.swim();

        System.out.println("1.Shark  ");
        Shark s = new Shark();
        s.swim();
        s.shark();

        System.out.println("2.Tuna ");
        Tuna t = new Tuna();
        t.swim();
        t.Tuna();
    }
}
class Animal{
    void breath(){
        System.out.println("breath"); // parent class (same parent class and 2 derived or child class = hierarchical inheritance)
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim"); //child class of Animal
    }
}
class Shark extends Fish{
    void shark(){
        System.out.println("Shark from fish category"); // child class of fish
    }
}
class Tuna extends Fish{
   void Tuna(){
        System.out.println("Tuna from fish category"); // child class of fish (Animal>> Fish >>1.Shark 2.Tuna = hybrid inheritance)
    } 
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly"); // child class of Animal
    }
}