
 abstract class Animal{ // blueprint 
    abstract void walk();
    Animal(){
        System.out.println("animal");
    }
    public void eat(){
        System.out.println("eating");
    }
}

class Horse extends Animal{

    Horse(){
        System.out.println("creatred horese");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
public class Abstract {
    public static void main(String[] args) {
        
        Horse horse = new Horse();
       // h1.walk();
        //h1.eat(); // abstract class form base class
    }
}
