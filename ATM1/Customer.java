package ATM1;

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    Customer(String n, ATM a, int amt) {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.Withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}
