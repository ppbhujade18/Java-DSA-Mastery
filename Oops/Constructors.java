public class Constructors {
    public static void main(String[] args) {

        //calling constructors using objects
        Student s1 = new Student();
        Student s2 = new Student("Pranav");   //constructor Overloading - calling multiple constructor
        Student s3 =  new Student(7);

        System.out.println(s2.name);
        System.out.println(s3.roll_no);
    }
}

class Student{
    String name;
    int roll_no;

    Student(){
        System.out.println("Non-parameterized Constructor called ...."); // create non-parameterized Constructor
    }

    //creation of  parameterized Constructor
    Student(String name){
         
        this.name = name;
    }
    Student(int roll_no){
        this.roll_no = roll_no; 
    }
}
