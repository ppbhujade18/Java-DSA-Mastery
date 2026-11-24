public class Key { //static Keyword
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SCSV";  
        System.out.println("School : "+ Student.schoolName);
        
        s1.setName("Pranav");
        System.out.println( "Name : " + s1.getName());

        s1.setRoll(5);
        System.out.println("Roll No : " + s1.getroll());

        System.out.println( "Percentage " + s1.calcPercentage(100, 89, 85) + "%");

        System.out.println();

        Student s2 = new Student();

        System.out.println("School : "+ Student.schoolName);

        s2.setName("Rishi");
        System.out.println( "Name : " + s2.getName());

        s2.setRoll(6);
        System.out.println("Roll No : " + s2.getroll()); 

        System.out.println( "Percentage " + s2.calcPercentage(95, 79, 85) + "%");
    }
}
class Student{
    int roll;
    String name;
    static String schoolName; // static keyword used in properties, avoid String creation every time
    

    static int calcPercentage(int phy, int math, int chem){  // static Keyword used in function used this function for every object 
        return (phy+ math + chem)/3;
    }

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    void setRoll(int roll){
        this.roll = roll;
    }
    int getroll(){
        return this.roll;
    }
}
