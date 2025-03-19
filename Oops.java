
class Pen {
    String color;
    String type;

    public void wrtie(){
        System.out.println("writing some thing");
    }


    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //paramaterized constructor 

    // Student(String name, int age){
    //     this.name= name;
    //    this.age=age;
      
    // }

//     Student(Student s2){ // copy constructor
//         this.name=s2.name;
//         this.age=s2.age;
//     }
//     Student(){

//     }
// }

//------------------------- polymorphism------------------------------
// compile time 

public void printInfo(int age){
    System.out.println(age);

}
public void printInfo(String name){
    System.out.println(name);
}
public void printInfo(String name ,int age){
    System.out.println(name+" "+age);
}

}
public class Oops {

    public static void main(String[]args){

        // object of class pen

        // new means when we use new keyword then in the memory space is reserved for storing the data.
        Pen e = new Pen();//Pen() = default constructor
        e.color = "red";
        e.type ="ballpoint";

       // another object of class pen 
        Pen e1 = new Pen();
        e1.color="black";
        e1.type="ballpoint";

        Student s1 = new Student();//New Studemt("kittu",22); //parameterized constructor
        s1.name="goli";
        s1.age=01;
        //Student s2 = new Student(s1); // new Student(s1); here we copying the properties of s1 
       
        //e.printcolor();
       // e1.printcolor();

       s1.printInfo(s1.age);
    }


}