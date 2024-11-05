import javax.swing.JOptionPane;

import classes.Character;
import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person jonh = new Person("Jonh", 20, 1.6f);
        jonh.showData();
        // jonh.setName("Jonh");
        // jonh.setAge(20);
        // jonh.setHeight(1.87f);

        // Character
        String name = JOptionPane.showInputDialog(null, "Name of character:");
        String role = JOptionPane.showInputDialog(null, "What is your role?");
        Character gzoin = new Character(name, role);
        gzoin.showStatus();
    }
}
