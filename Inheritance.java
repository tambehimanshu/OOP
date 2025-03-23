class  Shape{
    int type;
    public void area(){
        System.out.println("display area");
    }
    

}

class Triangle extends Shape{ //till here single level inherit

    public void area(int l ,int h){
        System.out.println(1/2 *l*h);
    }
}
class EquilateralTriangle extends Triangle{ //till here milti level inherit
    public void area(int l ,int h){
        System.out.println(1/2 *l*h);
    }
}  

class Cricle extends Shape{ // till here hirarchical inherit
    public void area (int radius){
        System.out.println((3.14)*radius*radius);
    }
}
public class Inheritance {

    public static void main(String[] args) {

               Cricle c1= new  Cricle();
               c1.area(2);
    }
    
}
