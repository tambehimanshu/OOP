public class Counter {
    int inc;
  
    public Counter (int inc ){
        this.inc = inc;  
        
    }
    public static void increment(int inc){
      inc = inc +1;
        System.out.println(inc);
    }
    public static void main(String[] args){
        Counter c1 = new Counter(0);
        increment(c1.inc);
    }
    
}
