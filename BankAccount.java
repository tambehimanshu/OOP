public class BankAccount {
    int money ;
    int depo;
    int withdrawl;

    public BankAccount(int money,int depo, int w){
        this.money = money;
        this.depo = depo;
        this.withdrawl =w;
    }


    public static void deopsite(int money,int depo){
        money = money+ depo;
        System.out.println(money);

    }
    public static void main(String[] args) {
        BankAccount b1= new BankAccount(1000, 5000, 0);
        deopsite(b1.money, b1.depo);
        
    }
}
