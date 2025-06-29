public class Point {
    float a1;
    float a2;
    float b1;
    float b2;

    public Point(float a1 ,float a2,float b1,float b2){
        this.a1 =a1;
        this.a2 =a2;
        this.b1 = b1;
        this.b2 = b2;
    }
    public static void finddist(float a1 ,float a2 ,float b1, float b2){
        float cal = (((a2-a1)*(a2-a1))+((b2-b1)*(b2-b1)));
        float dist = (float) Math.sqrt(cal);
        System.out.println(dist);

    }
    public static void main(String[] args) {
        Point p1 = new Point(1, 8,7,4);
        finddist(p1.a1,p1.a2 , p1.b1,p1.b2);
    }
    
}
