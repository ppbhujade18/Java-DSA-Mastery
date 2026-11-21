public class Constructors1{
    public static void main (String args[]){
        Student s1 = new Student();
        s1.name = " Pranav";
        s1.roll = 123;
        s1.password = "abcd"; 

        s1.marks[0] = 100;
        s1.marks[1] = 70;    // assigned marks in the array  ///shallow copy >> changes reflected after copying
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copied s1 values
        s2.password ="xysz"; 
        s1.marks[1]= 85; //after copying we change it of subject marks

        for(int i=0;i<3;i++){
            System.out.println( s2.marks[i]);
        }

    }

}

class Student{
    String name;
    int roll;
    String password;
    int marks [];


    // deep copy constructor

    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;

        // for copying marks 

        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i]; //here output will be 100, 70, 80 (means changes not reflected after creating deep copy constructor)
        }
    }
    
    // copy constructor

    // Student(Student s1){ 
    //     //shallow copy constructor  
    //     marks= new int [3];  ////here output will be 100, 85, 80 (it changes marks after copying values of s1)
    //     this.name = s1.name;
    //     this.roll =s1.roll;
    //     this.marks = s1.marks;
    // }
    Student(){
        marks = new int [3];
        System.out.println("constructor called");
    }

    Student(String name, int roll){
        marks = new int [3];
        this.name = name;
        this.roll= roll;

    }

}
