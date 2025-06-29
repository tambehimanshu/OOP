public class Employee1 {
    long salary ;

    public Employee1(long salary){
        this.salary = salary;
    }
    public static void inc(long sal){
        System.out.println(sal*12);
    }
    public static void main(String[] args) {
        Employee1 em1 = new Employee1(1220);
        inc(em1);
        

    }
}