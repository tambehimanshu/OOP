
interface Animal{
    int eye =2;//this value will be ssame for all
   void walk();
}
interface Herbivore {// multiple inheritance is possible with interface

}


class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

public class Interfce {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        System.out.println(h1.eye);
    }
}
