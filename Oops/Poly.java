public class Poly {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        // same name , different parameters = method overloading 
        System.out.println(cal.sum((float)1.2,(float)2.3));
        System.out.println(cal.sum(2, 3));
        System.out.println(cal.sum(1,2, 8));

        //method overriding  - parent and child classes , both contains same functions different definition 
        //but when we create object of child class then it runs function under child class only not its parent class 
        Deer d = new Deer();
        d.eats();
    }
}
class Calculator{
    //polymorphism many forms of sum
    // same name , different parameters = method overloading 

    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{

    void eats(){
        System.out.println("eats anything"); // same function
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass"); //same function  
    }
}
