
//getters and setter 

public class Oops1{
    public static void main(String[] args) {
        Student s1 =  new Student();
        //Set info using setters

        s1.setName("Aditya"); 
        s1.setAge(17);
        s1.setUid("A1B2C3");

        //Get info using getters

        System.out.println("Name : " + s1.name); // we can get name without using getters 

        System.out.println("Age : " + s1.getAge()); //but we can't access age and uid because those credentials are hidden 

        // if we access like this - System.out.println(s1.age); , got error of field is not visible 
        // using access modifiers (Encapsulation applied here using private keyword) credentials will visible 
        //for  Accessing hidden credentials, we need to create get method inside same class which we can use in main class

        System.out.println("Uid : " + s1.getUid()); 
    }
}

class Student{
    String name ;
    private int age;
    private String uid;

    public void setName(String n){
        name =n;
    }
    public String getname(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a ;
    }
    public String getUid(){
        return uid;
    }
    public void setUid(String u){
        uid = u;
    }
}