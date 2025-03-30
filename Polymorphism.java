

class Student{
    String name;
    int age;
Student(){
   
}

// polymorphism function overloading means same function name in the single class 
public void printInfo(String name){
    System.out.println(name);
}

public void printInfo(int age){
    System.out.println(age);
}
public void printInfo(int age,String name){
    System.out.println(age+" "+name);
}


}
public class Polymorphism {
    

    public static void main(String[] args) {

Student s1 = new Student();
s1.name="fitu";
s1.age=12;


        
s1.printInfo(s1.age);
s1.printInfo(s1.age,s1.name);

    }
}
