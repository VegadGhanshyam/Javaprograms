package ATM1;

public class ATMmachine {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("Ghanshyam",atm,1000);
        Customer c2=new Customer("Vegad",atm,2000);
        c1.start();
        c2.start();
    }
}