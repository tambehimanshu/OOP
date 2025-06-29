

public class Employee {
    long salary ;

    public Employee(long salary){
        this.salary = salary;
    }
    public static void inc(long sal){
        System.out.println(sal*12);
    }
    public static void main(String[] args) {
        Employee em1 = new Employee(1220);
        inc(em1);
        

    }
}
