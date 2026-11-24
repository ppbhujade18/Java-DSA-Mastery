public class MultipleInherit {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatsGrass();
        b.eatsMeat();
        b.eatsBoth();
        
    }
}
interface Herbivore{
    void eatsGrass();
}
interface Carnivore{
    void eatsMeat();
}
interface Omnivore{
    void eatsBoth();
}
class Bear implements Herbivore, Carnivore, Omnivore{
    public void eatsGrass(){
        System.out.println("Bear eats Grass");
    }
    public void eatsMeat(){
        System.out.println("Bear eats Meat also");
    }
    public void eatsBoth(){
        System.out.println("Bear is Omnivore");
    }

}
