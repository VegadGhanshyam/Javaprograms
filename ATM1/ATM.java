package ATM1;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.print(name + " checking");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(" Balance");
    }

    synchronized public void Withdraw(String name, int amount) {
        System.out.print(name + " Withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(amount);
    }
}
