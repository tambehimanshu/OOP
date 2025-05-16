package packagee;


class Account{
    public String name;
    protected String email;
    private String password;

    public void setpassword(String pass){
        this.password = pass;
    }

    public String getpassword(){
        return this.password;
    }

}
public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name="nama";
        a1.email="hna@gmail.com";
        a1.setpassword("veosv");
        System.out.println(a1.getpassword());


        
    }
    
}
