package classes;

public class bankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double value) {
        if(value < 0) {
            System.out.println("Negative numbers is not avaliable to deposit.");
        } else {
            balance = balance + value;
        }
    }

}
