import classes.Person;
import classes.bankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        Person jonh = new Person();
        System.out.println(jonh.getName());
        jonh.setName("Sponge Bob");
        System.out.println(jonh.getName());
        jonh.setHeight(2.3);
        System.out.println(jonh.getHeight());

        // Bank Account
        bankAccount account1 = new bankAccount();
        account1.setBalance(40.50);
        System.out.println(account1.getBalance());
        account1.deposit(-99.42);
        System.out.println(account1.getBalance());

    }
}
